package za.co.mkhungo.facade.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mkhungo.facade.ProductFacade;
import za.co.mkhungo.repository.ProductRepository;

/**
 * @author Noxolo.Mkhungo
 */
@RequiredArgsConstructor
@Component
@Scope("singleton")
@Slf4j
public class DefaultProductFacade implements ProductFacade {
  private ProductRepository productRepository;
}
