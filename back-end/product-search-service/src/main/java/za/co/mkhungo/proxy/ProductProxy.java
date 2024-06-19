package za.co.mkhungo.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import za.co.mkhungo.common.response.ProductResponse;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */

//@FeignClient(name="product-service", url="localhost:8082")
@FeignClient(name="product-service")
public interface ProductProxy {
    @GetMapping("/product-service/")
    Collection<ProductResponse> retrieveProducts();
}
