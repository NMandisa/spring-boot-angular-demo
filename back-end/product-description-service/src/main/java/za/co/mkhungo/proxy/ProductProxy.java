package za.co.mkhungo.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import za.co.mkhungo.common.response.ProductResponse;

/**
 * @author Noxolo.Mkhungo
 */

//@FeignClient(name="product-service", url="localhost:8082")
@FeignClient(name="product-service")
public interface ProductProxy {
    @PostMapping("/product-service/{id}")
    ProductResponse retrieveProductbyId(@PathVariable("id") Long id);
}
