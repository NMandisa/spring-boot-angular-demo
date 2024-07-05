package za.co.mkhungo.facade.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mkhungo.facade.CustomerSegmentationFacade;
import za.co.mkhungo.repository.CustomerSegmentIndexRepository;
import za.co.mkhungo.repository.CustomerSegmentationRepository;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@Slf4j
public class DefaultCustomerSegmentationFacade implements CustomerSegmentationFacade {
  private final CustomerSegmentIndexRepository customerSegmentationIndexRepository;
  private final CustomerSegmentationRepository customerSegmentationRepository;
  @Autowired
  public DefaultCustomerSegmentationFacade(@Qualifier("customerSegmentationRepository") CustomerSegmentationRepository customerSegmentationRepository,@Qualifier("customerSegmentIndexRepository") CustomerSegmentIndexRepository customerSegmentationIndexRepository){
    this.customerSegmentationIndexRepository=customerSegmentationIndexRepository;
    this.customerSegmentationRepository=customerSegmentationRepository;
  }
}
