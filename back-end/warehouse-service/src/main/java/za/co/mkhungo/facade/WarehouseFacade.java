package za.co.mkhungo.facade;

import za.co.mkhungo.domain.Warehouse;
import za.co.mkhungo.response.WarehouseResponse;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
public interface WarehouseFacade {
    Collection<WarehouseResponse> warehouses();
    Long save(Warehouse warehouse);
    WarehouseResponse getWarehouse(Long id);
}
