package za.co.mkhungo.facade.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mkhungo.domain.ProductDescription;
import za.co.mkhungo.facade.ProductDescriptionFacade;
import za.co.mkhungo.repository.ProductDescriptionRepository;
import za.co.mkhungo.response.ProductDescriptionResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@Slf4j
public class DefaultProductDescriptionFacade implements ProductDescriptionFacade {
  private ProductDescriptionRepository productDescriptionRepository;
  @Autowired
  public DefaultProductDescriptionFacade(ProductDescriptionRepository productDescriptionRepository) {
    this.productDescriptionRepository = productDescriptionRepository;
  }

  @Override
  public Collection<ProductDescriptionResponse> productDescriptions() {
    List<ProductDescriptionResponse> productResponse=new ArrayList<>();
    List<ProductDescription> products= productDescriptionRepository.findAll();
    products.forEach(product -> {
      log.info("Product : " + product);
      productResponse.add(setProductResponse(product));
    });
    return productResponse;
  }
  private ProductDescriptionResponse setProductResponse(ProductDescription product){
    return new ProductDescriptionResponse(product);
  }
}