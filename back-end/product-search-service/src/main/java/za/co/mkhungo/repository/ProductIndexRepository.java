package za.co.mkhungo.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import za.co.mkhungo.common.response.ProductResponse;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductIndexRepository extends ElasticsearchRepository<ProductResponse,String> {
}
