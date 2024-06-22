package za.co.mkhungo.facade.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mkhungo.facade.ProductImageFacade;
import za.co.mkhungo.repository.ProductImageRepository;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@Slf4j
public class DefaultProductImageFacade implements ProductImageFacade {
  private ProductImageRepository productImageRepository;
  @Autowired
  public DefaultProductImageFacade(ProductImageRepository productImageRepository) {
    this.productImageRepository = productImageRepository;
  }

}