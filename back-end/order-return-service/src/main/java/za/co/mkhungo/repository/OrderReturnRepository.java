package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.OrderReturn;

/**
 * @author Noxolo.Mkhungo
 */
public interface OrderReturnRepository extends JpaRepository<OrderReturn,Long> {
}
