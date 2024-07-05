package za.co.mkhungo.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import za.co.mkhungo.domain.CustomerSegmentation;

/**
 * @author Noxolo.Mkhungo
 */
@Repository("customerSegmentIndexRepository")
public interface CustomerSegmentIndexRepository extends ElasticsearchRepository<CustomerSegmentation,String> {
}
