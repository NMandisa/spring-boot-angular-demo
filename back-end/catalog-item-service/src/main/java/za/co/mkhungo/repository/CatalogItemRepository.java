package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.CatalogItem;

/**
 * @author Noxolo.Mkhungo
 */
public interface CatalogItemRepository extends JpaRepository<CatalogItem,Long> {
}
