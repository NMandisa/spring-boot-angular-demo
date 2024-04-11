package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.ProductReviewFacade;
import za.co.mkhungo.response.ProductReviewResponse;
import za.co.mkhungo.service.ProductReviewService;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultProductReviewService implements ProductReviewService {
  private final ProductReviewFacade productReviewFacade;
  public DefaultProductReviewService(@Qualifier("defaultProductReviewFacade") ProductReviewFacade productReviewFacade){
    this.productReviewFacade=productReviewFacade;
  }

  @Override
  public Collection<ProductReviewResponse> getProductReviews() {
    return productReviewFacade.reviews();
  }
}
