package za.co.mkhungo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Noxolo.Mkhungo
 */
@Document(collection = "product_image")
public class ProductImage {
    @Id
    private String id;
    private String name;
    private String location;
}
