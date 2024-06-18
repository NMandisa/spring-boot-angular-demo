package za.co.mkhungo.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import za.co.mkhungo.common.response.ProductDescriptionResponse;

/**
 * @author Noxolo.Mkhungo
 */
//@FeignClient(name="product-description-service", url="localhost:8094")
@FeignClient(name="product-description-service")
public interface ProductDescriptionProxy {
    @GetMapping("/product-description-service/")
    ProductDescriptionResponse retrieveProductDesciptions();
    @PostMapping("/product-description-service/{id}")
    ProductDescriptionResponse retrieveProductDesciptionById(@PathVariable("id") Long id);
}
