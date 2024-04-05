package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.Category;

/**
 * @author Noxolo.Mkhungo
 */
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
