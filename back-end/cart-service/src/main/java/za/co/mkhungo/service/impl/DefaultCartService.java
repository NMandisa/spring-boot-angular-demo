package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.CartFacade;
import za.co.mkhungo.service.CartService;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultCartService implements CartService {
  private final CartFacade cartFacade;
  public DefaultCartService(@Qualifier("defaultCartFacade") CartFacade cartFacade){
    this.cartFacade=cartFacade;
  }
}
