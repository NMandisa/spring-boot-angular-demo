package za.co.mkhungo.service;

import za.co.mkhungo.response.ProductPricingResponse;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductPricingService extends Serializable {
    Collection<ProductPricingResponse> getProductsPrices();
    ProductPricingResponse getProductPrice(Long id);
}
