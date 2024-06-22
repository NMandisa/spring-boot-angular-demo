package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.ProductImageFacade;
import za.co.mkhungo.response.ProductImageResponse;
import za.co.mkhungo.service.ProductImageService;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultProductImageService implements ProductImageService {
  private final ProductImageFacade productImageFacade;
  public DefaultProductImageService(@Qualifier("defaultProductImageFacade") ProductImageFacade productImageFacade){
    this.productImageFacade=productImageFacade;
  }
}
