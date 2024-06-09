package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.Order;

/**
 * @author Noxolo.Mkhungo
 */
public interface OrderRepository extends JpaRepository<Order,Long> {
}
