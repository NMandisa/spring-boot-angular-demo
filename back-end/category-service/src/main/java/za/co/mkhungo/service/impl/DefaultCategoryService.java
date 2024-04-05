package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.CategoryFacade;
import za.co.mkhungo.service.CategoryService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultCategoryService implements CategoryService {
  @SuppressWarnings("unsed")
  private final CategoryFacade categoryFacade;
  public DefaultCategoryService(@Qualifier("defaultCategoryFacade") CategoryFacade categoryFacade){
      this.categoryFacade=categoryFacade;
  }
}
