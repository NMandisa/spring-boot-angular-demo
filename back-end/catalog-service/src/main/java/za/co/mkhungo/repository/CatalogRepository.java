package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.Catalog;

/**
 * @author Noxolo.Mkhungo
 */
public interface CatalogRepository extends JpaRepository<Catalog,Long> {
}
