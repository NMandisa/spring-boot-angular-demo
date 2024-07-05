package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.StoreLocatorFacade;
import za.co.mkhungo.service.StoreLocatorService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultStoreLocatorService implements StoreLocatorService {
  @SuppressWarnings("unsed")
  private final StoreLocatorFacade categoryFacade;
  public DefaultStoreLocatorService(@Qualifier("defaultStoreLocatorFacade") StoreLocatorFacade categoryFacade){
      this.categoryFacade=categoryFacade;
  }
}
