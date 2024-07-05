package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.CustomerSegmentationFacade;
import za.co.mkhungo.service.CustomerSegmentationService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultCustomerSegmentationService implements CustomerSegmentationService {
  @SuppressWarnings("unsed")
  private final CustomerSegmentationFacade categoryFacade;
  public DefaultCustomerSegmentationService(@Qualifier("defaultCustomerSegmentationFacade") CustomerSegmentationFacade categoryFacade){
      this.categoryFacade=categoryFacade;
  }
}
