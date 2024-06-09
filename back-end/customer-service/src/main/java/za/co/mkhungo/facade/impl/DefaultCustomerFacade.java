package za.co.mkhungo.facade.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mkhungo.facade.CustomerFacade;
import za.co.mkhungo.repository.CustomerRepository;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@RequiredArgsConstructor
@Slf4j
public class DefaultCustomerFacade implements CustomerFacade {
  private CustomerRepository customerRepository;
}
