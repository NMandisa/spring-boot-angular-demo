package za.co.mkhungo.facade.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import za.co.mkhungo.domain.ProductRating;
import za.co.mkhungo.facade.ProductRatingFacade;
import za.co.mkhungo.proxy.ProductProxy;
import za.co.mkhungo.repository.ProductRatingRepository;
import za.co.mkhungo.response.ProductRatingResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@Slf4j
public class DefaultProductRatingFacade implements ProductRatingFacade {
  private ProductRatingRepository productRatingRepository;
  private ProductProxy productProxy;
  private RestTemplate restTemplate;
  @Autowired
  public DefaultProductRatingFacade(ProductRatingRepository productRatingRepository,ProductProxy productProxy, RestTemplate restTemplate) {
    this.productRatingRepository = productRatingRepository;
    this.productProxy=productProxy;
    this.restTemplate=restTemplate;
  }

  @Override
  public Collection<ProductRatingResponse> productRatings() {
    List<ProductRatingResponse> productResponse=new ArrayList<>();
    List<ProductRating> products= productRatingRepository.findAll();
    products.forEach(product -> {
      log.info("Product : " + product);
      productResponse.add(setProductResponse(product));
    });
    return productResponse;
  }
  private ProductRatingResponse setProductResponse(ProductRating productRating){
    return new ProductRatingResponse(productRating);
  }
}
