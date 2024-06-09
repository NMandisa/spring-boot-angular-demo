package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.ShippingFacade;
import za.co.mkhungo.service.ShippingService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultShippingService implements ShippingService {
  private final ShippingFacade shippingFacade;
  public DefaultShippingService(@Qualifier("defaultShippingFacade") ShippingFacade shippingFacade){
    this.shippingFacade=shippingFacade;
  }
}
