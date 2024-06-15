package za.co.mkhungo.proxy;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Noxolo.Mkhungo
 */
//@FeignClient(name="product-service", url="localhost:8082")
@FeignClient(name="product-service")
public interface ProductProxy {
}
