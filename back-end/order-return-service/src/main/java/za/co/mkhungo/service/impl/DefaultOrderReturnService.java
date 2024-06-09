package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.OrderReturnFacade;
import za.co.mkhungo.service.OrderReturnService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultOrderReturnService implements OrderReturnService {
  private final OrderReturnFacade orderReturnFacade;
  public DefaultOrderReturnService(@Qualifier("defaultOrderReturnFacade") OrderReturnFacade orderReturnFacade){
    this.orderReturnFacade=orderReturnFacade;
  }
}
