package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.Shipping;

/**
 * @author Noxolo.Mkhungo
 */
public interface ShippingRepository extends JpaRepository<Shipping,Long> {
}
