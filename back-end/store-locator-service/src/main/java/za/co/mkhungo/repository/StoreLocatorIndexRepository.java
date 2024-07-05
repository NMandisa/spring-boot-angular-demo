package za.co.mkhungo.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import za.co.mkhungo.domain.search.StoreLocatorIndex;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface StoreLocatorIndexRepository extends ElasticsearchRepository<StoreLocatorIndex,Long> {
}
