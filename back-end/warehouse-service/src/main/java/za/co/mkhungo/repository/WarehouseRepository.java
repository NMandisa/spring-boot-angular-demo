package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import za.co.mkhungo.domain.Warehouse;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
public interface WarehouseRepository extends JpaRepository<Warehouse,Long> {
    Collection<Warehouse> findByStockId(@Param("stockId") Long stockId);
}
