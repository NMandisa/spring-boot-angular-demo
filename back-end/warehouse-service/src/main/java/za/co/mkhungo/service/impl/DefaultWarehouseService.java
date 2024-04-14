package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.WarehouseFacade;
import za.co.mkhungo.service.WarehouseService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultWarehouseService implements WarehouseService {
  private final WarehouseFacade warehouseFacade;
  public DefaultWarehouseService(@Qualifier("defaultWarehouseFacade") WarehouseFacade warehouseFacade){
    this.warehouseFacade=warehouseFacade;
  }
}
