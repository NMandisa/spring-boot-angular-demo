package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.ProductFacade;
import za.co.mkhungo.response.ProductResponse;
import za.co.mkhungo.service.ProductService;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultProductService implements ProductService {
  private final ProductFacade productFacade;
  public DefaultProductService(@Qualifier("defaultProductFacade") ProductFacade productFacade){
    this.productFacade=productFacade;
  }
  @Override
  public Collection<ProductResponse> getProducts() {
    return productFacade.products();
  }

  /**
   * @param id
   * @return
   */
  @Override
  public ProductResponse getProduct(Long id) {
    return productFacade.getProduct(id);
  }
}
