package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.NavigationFacade;
import za.co.mkhungo.service.NavigationService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultNavigationService implements NavigationService {
  private final NavigationFacade navigationFacade;
  public DefaultNavigationService(@Qualifier("defaultNavigationFacade") NavigationFacade navigationFacade){
    this.navigationFacade=navigationFacade;
  }
}
