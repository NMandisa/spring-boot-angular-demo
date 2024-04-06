package za.co.mkhungo.facade.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mkhungo.domain.Product;
import za.co.mkhungo.facade.ProductFacade;
import za.co.mkhungo.repository.ProductRepository;
import za.co.mkhungo.response.ProductResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@Slf4j
public class DefaultProductFacade implements ProductFacade {
  private ProductRepository productRepository;
  @Autowired
  public DefaultProductFacade(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public Collection<ProductResponse> products() {
    List<ProductResponse> productResponse=new ArrayList<>();
    List<Product> products= productRepository.findAll();
    products.forEach(product -> {
      log.info("Product : " + product);
      productResponse.add(setProductResponse(product));
    });
    return productResponse;
  }
  private ProductResponse setProductResponse(Product product){
    return new ProductResponse(product);
  }
}
