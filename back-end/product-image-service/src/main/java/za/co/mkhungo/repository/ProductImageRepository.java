package za.co.mkhungo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import za.co.mkhungo.domain.ProductImage;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductImageRepository extends MongoRepository<ProductImage,String> {
}
