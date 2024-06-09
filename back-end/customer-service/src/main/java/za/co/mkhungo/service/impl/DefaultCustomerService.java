package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.CustomerFacade;
import za.co.mkhungo.service.CustomerService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultCustomerService implements CustomerService {
  private final CustomerFacade customerFacade;
  public DefaultCustomerService(@Qualifier("defaultCustomerFacade") CustomerFacade customerFacade){
    this.customerFacade=customerFacade;
  }
}
