package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.ProductDescription;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductDescriptionRepository extends JpaRepository<ProductDescription,Long> {
}
