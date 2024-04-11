package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.ProductReview;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductReviewRepository extends JpaRepository<ProductReview,Long> {
}
