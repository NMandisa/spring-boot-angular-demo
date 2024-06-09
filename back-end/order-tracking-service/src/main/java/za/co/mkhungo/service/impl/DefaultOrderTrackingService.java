package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.OrderTrackingFacade;
import za.co.mkhungo.service.OrderTrackingService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultOrderTrackingService implements OrderTrackingService {
  private final OrderTrackingFacade orderTrackingFacade;
  public DefaultOrderTrackingService(@Qualifier("defaultOrderTrackingFacade") OrderTrackingFacade orderTrackingFacade){
    this.orderTrackingFacade=orderTrackingFacade;
  }
}
