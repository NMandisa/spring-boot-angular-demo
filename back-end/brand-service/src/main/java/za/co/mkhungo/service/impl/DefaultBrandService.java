package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.BrandFacade;
import za.co.mkhungo.service.BrandService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultBrandService implements BrandService {
  private BrandFacade brandFacade;
  public DefaultBrandService(@Qualifier("defaultBrandFacade") BrandFacade brandFacade){
    this.brandFacade=brandFacade;
  }
}
