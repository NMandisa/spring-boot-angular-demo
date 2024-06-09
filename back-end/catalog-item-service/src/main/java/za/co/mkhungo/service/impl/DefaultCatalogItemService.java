package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.CatalogItemFacade;
import za.co.mkhungo.service.CatalogItemService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultCatalogItemService implements CatalogItemService {
  private final CatalogItemFacade catalogItemFacade;
  public DefaultCatalogItemService(@Qualifier("defaultCatalogItemFacade") CatalogItemFacade catalogItemFacade){
    this.catalogItemFacade=catalogItemFacade;
  }
}
