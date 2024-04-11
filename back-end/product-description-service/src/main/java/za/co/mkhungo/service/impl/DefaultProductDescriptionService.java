package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.ProductDescriptionFacade;
import za.co.mkhungo.response.ProductDescriptionResponse;
import za.co.mkhungo.service.ProductDescriptionService;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultProductDescriptionService implements ProductDescriptionService {
  private final ProductDescriptionFacade productDescriptionFacade;
  public DefaultProductDescriptionService(@Qualifier("defaultProductDescriptionFacade") ProductDescriptionFacade productDescriptionFacade){
    this.productDescriptionFacade=productDescriptionFacade;
  }

  @Override
  public Collection<ProductDescriptionResponse> getProductDescriptions() {
    return productDescriptionFacade.productDescriptions();
  }
}
