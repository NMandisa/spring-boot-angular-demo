package za.co.mkhungo.domain.search;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author Noxolo.Mkhungo
 */
@Document(indexName = "customer_segment_index")
public class StoreLocatorIndex {

    @Id
    private Long id;
}
