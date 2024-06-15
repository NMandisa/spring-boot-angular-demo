package za.co.mkhungo.proxy;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Noxolo.Mkhungo
 */
//@FeignClient(name="product-review-service", url="localhost:8086")
@FeignClient(name="product-review-service")
public interface ProductReviewProxy {
}
