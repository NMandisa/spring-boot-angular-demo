package za.co.mkhungo.proxy;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Noxolo.Mkhungo
 */
//@FeignClient(name="product-rating-service", url="localhost:8085")
@FeignClient(name="product-rating-service")
public interface ProductRatingProxy {
}
