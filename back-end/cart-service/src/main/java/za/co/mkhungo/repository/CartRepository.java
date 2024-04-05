package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.Cart;

/**
 * @author Noxolo.Mkhungo
 */
public interface CartRepository extends JpaRepository<Cart,Long> {
}
