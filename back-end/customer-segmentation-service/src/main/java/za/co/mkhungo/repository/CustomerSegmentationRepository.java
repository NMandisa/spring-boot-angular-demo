package za.co.mkhungo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import za.co.mkhungo.domain.CustomerSegmentation;

/**
 * @author Noxolo.Mkhungo
 */
@Repository("customerSegmentationRepository")
public interface CustomerSegmentationRepository extends MongoRepository<CustomerSegmentation,String> {
}
