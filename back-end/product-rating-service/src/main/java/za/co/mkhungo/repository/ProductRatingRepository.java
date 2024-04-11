package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.ProductRating;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductRatingRepository extends JpaRepository<ProductRating,Long> {
}
