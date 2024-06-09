package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.Checkout;

/**
 * @author Noxolo.Mkhungo
 */
public interface CheckoutRepository extends JpaRepository<Checkout,Long> {
}
