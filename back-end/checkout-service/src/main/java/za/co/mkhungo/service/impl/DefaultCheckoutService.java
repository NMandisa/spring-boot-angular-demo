package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.CheckoutFacade;
import za.co.mkhungo.service.CheckoutService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultCheckoutService implements CheckoutService {
  private final CheckoutFacade navigationFacade;
  public DefaultCheckoutService(@Qualifier("defaultCheckoutFacade") CheckoutFacade navigationFacade){
    this.navigationFacade=navigationFacade;
  }
}
