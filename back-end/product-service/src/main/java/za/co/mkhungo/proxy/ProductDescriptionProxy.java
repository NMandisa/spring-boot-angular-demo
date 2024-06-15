package za.co.mkhungo.proxy;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Noxolo.Mkhungo
 */
//@FeignClient(name="product-description-service", url="localhost:8094")
@FeignClient(name="product-description-service")
public interface ProductDescriptionProxy {
}
