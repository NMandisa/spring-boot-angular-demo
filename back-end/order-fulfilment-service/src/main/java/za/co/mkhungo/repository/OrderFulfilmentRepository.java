package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.OrderFulfilment;

/**
 * @author Noxolo.Mkhungo
 */
public interface OrderFulfilmentRepository extends JpaRepository<OrderFulfilment,Long> {
}
