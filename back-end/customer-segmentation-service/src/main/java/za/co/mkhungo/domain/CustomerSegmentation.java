package za.co.mkhungo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Noxolo.Mkhungo
 */
@Document(collection = "customer_segmentation")
public class CustomerSegmentation {
    @Id
    private String id;
}
