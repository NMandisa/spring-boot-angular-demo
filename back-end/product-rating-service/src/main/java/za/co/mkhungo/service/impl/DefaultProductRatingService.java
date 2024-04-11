package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.ProductRatingFacade;
import za.co.mkhungo.response.ProductRatingResponse;
import za.co.mkhungo.service.ProductRatingService;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultProductRatingService implements ProductRatingService {
  private final ProductRatingFacade productRatingFacade;
  public DefaultProductRatingService(@Qualifier("defaultProductRatingFacade") ProductRatingFacade productRatingFacade){
    this.productRatingFacade=productRatingFacade;
  }

  @Override
  public Collection<ProductRatingResponse> getProductRatings() {
    return productRatingFacade.productRatings();
  }
}
