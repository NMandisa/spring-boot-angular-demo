package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.CatalogFacade;
import za.co.mkhungo.service.CatalogService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultCatalogService implements CatalogService {
  private final CatalogFacade catalogFacade;
  public DefaultCatalogService(@Qualifier("defaultCatalogFacade") CatalogFacade catalogFacade){
    this.catalogFacade=catalogFacade;
  }
}
