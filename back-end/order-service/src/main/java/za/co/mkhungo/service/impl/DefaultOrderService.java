package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.OrderFacade;
import za.co.mkhungo.service.OrderService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultOrderService implements OrderService {
  private final OrderFacade orderFacade;
  public DefaultOrderService(@Qualifier("defaultOrderFacade") OrderFacade orderFacade){
    this.orderFacade=orderFacade;
  }
}
