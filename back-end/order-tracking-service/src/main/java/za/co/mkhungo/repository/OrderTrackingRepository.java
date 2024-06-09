package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.OrderTracking;

/**
 * @author Noxolo.Mkhungo
 */
public interface OrderTrackingRepository extends JpaRepository<OrderTracking,Long> {
}
