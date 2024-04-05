package za.co.mkhungo.facade.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mkhungo.facade.BrandFacade;
import za.co.mkhungo.repository.BrandRepository;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@Slf4j
@RequiredArgsConstructor
public class DefaultBrandFacade implements BrandFacade {
  private BrandRepository brandRepository;
}
