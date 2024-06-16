package za.co.mkhungo.facade.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import za.co.mkhungo.domain.Product;
import za.co.mkhungo.dto.ProductDTO;
import za.co.mkhungo.dto.ProductDescriptionDTO;
import za.co.mkhungo.exception.ProductException;
import za.co.mkhungo.exception.ProductNotFoundException;
import za.co.mkhungo.exception.handler.ProductResponseErrorHandler;
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
  private final ProductRepository productRepository;
  protected final ModelMapper modelMapper;
  @Autowired
  public DefaultProductFacade(ProductRepository productRepository, ModelMapper modelMapper) {
    this.productRepository = productRepository;
    this.modelMapper=modelMapper;
  }

  @Override
  public Collection<ProductResponse> products() {
    List<ProductResponse> productResponse=new ArrayList<>();
    List<Product> products= productRepository.findAll();
    products.forEach(product -> {
      log.info("Product : " + product);
      ProductDTO productDataTransfer = this.modelMapper.map(product, ProductDTO.class);
     productResponse.add(setProductResponse(productDataTransfer));
    });
    return productResponse;
}

  @Override
  public Long save(Product product) {
    //triggers creation of product-description,rating,reviews
    return productRepository.save(product).getId();
  }

  @Override
  public ProductResponse getProduct(Long id) {
    Product product = productRepository.findById(id).orElseThrow(ProductNotFoundException::new);
    //populate response with product-description,rating,reviews using RestClient
    return setProductResponse(convertModelToDto(product));
  }

  private ProductResponse setProductResponse(ProductDTO productDataTransfer){
    return new ProductResponse(productDataTransfer);
  }
  private ProductDTO convertModelToDto (Product product){
   return this.modelMapper.map(product, ProductDTO.class);
  }
  private Product convertDtoToModel (ProductDTO productDTO){
    return this.modelMapper.map(productDTO, Product.class);
  }

}
