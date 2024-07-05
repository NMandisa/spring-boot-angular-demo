package za.co.mkhungo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import za.co.mkhungo.facade.FulfilmentFacade;
import za.co.mkhungo.response.FulfilmentResponse;
import za.co.mkhungo.service.FulfilmentService;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
@Slf4j
public class DefaultFulfilmentService implements FulfilmentService {
  private final FulfilmentFacade fulfilmentFacade;
  public DefaultFulfilmentService(@Qualifier("defaultFulfilmentFacade") FulfilmentFacade fulfilmentFacade){
    this.fulfilmentFacade=fulfilmentFacade;
  }
}
