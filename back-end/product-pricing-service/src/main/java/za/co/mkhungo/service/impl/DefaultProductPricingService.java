package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.ProductPricingFacade;
import za.co.mkhungo.response.ProductPricingResponse;
import za.co.mkhungo.service.ProductPricingService;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultProductPricingService implements ProductPricingService {
  private final ProductPricingFacade productPricingFacade;
  public DefaultProductPricingService(@Qualifier("defaultProductPricingFacade") ProductPricingFacade productPricingFacade){
    this.productPricingFacade=productPricingFacade;
  }
  @Override
  public Collection<ProductPricingResponse> getProductsPrices() {
    return productPricingFacade.productsPricing();
  }

  /**
   * @param id productPricingId
   * @return ProductPricing as ProductPricingResponse Object
   */
  @Override
  public ProductPricingResponse getProductPrice(Long id) {
    return productPricingFacade.getProductPricing(id);
  }
}
