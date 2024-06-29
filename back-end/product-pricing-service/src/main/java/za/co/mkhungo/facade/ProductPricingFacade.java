package za.co.mkhungo.facade;

import za.co.mkhungo.domain.ProductPricing;
import za.co.mkhungo.response.ProductPricingResponse;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
public interface ProductPricingFacade extends Serializable {
    Collection<ProductPricingResponse> productsPricing();
    Long save(ProductPricing product);
    ProductPricingResponse getProductPricing(Long id);
}
