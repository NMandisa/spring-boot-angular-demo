package za.co.mkhungo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.mkhungo.domain.Fulfiment;

import java.io.Serializable;
import java.util.Optional;

/**
 * @author Noxolo.Mkhungo
 */
public interface FulfilmentRepository extends JpaRepository<Fulfiment,Long> , Serializable {
    @Override
    Optional<Fulfiment> findById(Long id);
}
