package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.ProductPricing;

import java.io.Serializable;
import java.util.Optional;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductPricingRepository extends JpaRepository<ProductPricing,Long> , Serializable {
    @Override
    Optional<ProductPricing> findById(Long id);
}
