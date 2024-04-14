package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.Stock;

/**
 * @author Noxolo.Mkhungo
 */
public interface StockRepository extends JpaRepository<Stock,Long> {
}
