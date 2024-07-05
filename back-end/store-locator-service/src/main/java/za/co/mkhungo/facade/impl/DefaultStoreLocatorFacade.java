package za.co.mkhungo.facade.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mkhungo.facade.StoreLocatorFacade;
import za.co.mkhungo.repository.StoreLocatorIndexRepository;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@Slf4j
public class DefaultStoreLocatorFacade implements StoreLocatorFacade {
  private  StoreLocatorIndexRepository storeLocatorIndexRepository;
  @Autowired
  public void setStoreLocatorIndexRepository(StoreLocatorIndexRepository storeLocatorIndexRepository){
    this.storeLocatorIndexRepository=storeLocatorIndexRepository;
  }
}
