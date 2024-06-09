package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.OrderFulfilmentFacade;
import za.co.mkhungo.service.OrderFulfilmentService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultOrderFulfilmentService implements OrderFulfilmentService {
  private final OrderFulfilmentFacade orderFulfilmentFacade;
  public DefaultOrderFulfilmentService(@Qualifier("defaultOrderFulfilmentFacade") OrderFulfilmentFacade orderFulfilmentFacade){
    this.orderFulfilmentFacade=orderFulfilmentFacade;
  }
}
