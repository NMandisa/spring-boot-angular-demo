package za.co.mkhungo.facade.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mkhungo.domain.Warehouse;
import za.co.mkhungo.facade.WarehouseFacade;
import za.co.mkhungo.repository.WarehouseRepository;
import za.co.mkhungo.response.WarehouseResponse;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@Slf4j
public class DefaultWarehouseFacade implements WarehouseFacade {
  private WarehouseRepository warehouseRepository;
  @Autowired
  public DefaultWarehouseFacade(WarehouseRepository warehouseRepository){
    super();
    this.warehouseRepository=warehouseRepository;
  }

  /**
   * @return
   */
  @Override
  public Collection<WarehouseResponse> warehouses() {
    return null;
  }

  /**
   * @param warehouse
   * @return
   */
  @Override
  public Long save(Warehouse warehouse) {
    return null;
  }

  /**
   * @param id
   * @return
   */
  @Override
  public WarehouseResponse getWarehouse(Long id) {
    return null;
  }
}
