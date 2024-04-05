package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.Product;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductRepository extends JpaRepository<Product,Long> {
}
