package za.co.mkhungo.facade.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mkhungo.domain.ProductReview;
import za.co.mkhungo.facade.ProductReviewFacade;
import za.co.mkhungo.repository.ProductReviewRepository;
import za.co.mkhungo.response.ProductReviewResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@Slf4j
public class DefaultProductReviewFacade implements ProductReviewFacade {
  private final ProductReviewRepository productReviewRepository;
  @Autowired
  public DefaultProductReviewFacade(ProductReviewRepository productReviewRepository) {
    this.productReviewRepository = productReviewRepository;
  }

  @Override
  public Collection<ProductReviewResponse> reviews() {
    List<ProductReviewResponse> productReviewResponse=new ArrayList<>();
    List<ProductReview> reviews= productReviewRepository.findAll();
    reviews.forEach(review -> {
      log.info("Product Review : " + review);
      productReviewResponse.add(setProductReviewResponse(review));
    });
    return productReviewResponse;
  }
  private ProductReviewResponse setProductReviewResponse(ProductReview review){
    return new ProductReviewResponse(review);
  }
}
