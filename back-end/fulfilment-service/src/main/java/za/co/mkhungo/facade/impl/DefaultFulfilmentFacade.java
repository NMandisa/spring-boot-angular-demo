package za.co.mkhungo.facade.impl;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mkhungo.domain.Fulfiment;
import za.co.mkhungo.dto.FulfilmentDTO;
import za.co.mkhungo.exception.FulfilmentNotFoundException;
import za.co.mkhungo.facade.FulfilmentFacade;
import za.co.mkhungo.repository.FulfilmentRepository;
import za.co.mkhungo.response.FulfilmentResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@Slf4j
public class DefaultFulfilmentFacade implements FulfilmentFacade {
  private final FulfilmentRepository fulfilmentRepository;
  private final ModelMapper modelMapper;
  @Autowired
  public DefaultFulfilmentFacade(FulfilmentRepository fulfilmentRepository, ModelMapper modelMapper) {
    this.fulfilmentRepository = fulfilmentRepository;
    this.modelMapper=modelMapper;
  }

  @Override
  public Collection<FulfilmentResponse> getFulfilments() {
    List<FulfilmentResponse> productsPricingResponse=new ArrayList<>();
    List<Fulfiment> fulfiments = fulfilmentRepository.findAll();
    return productsPricingResponse;
}

  @Override
  public Long save(Fulfiment fulfiment) {
    //triggers  product update or ...  we'll see what
    return fulfilmentRepository.save(fulfiment).getId();
  }

  /**
   * @param id
   * @return
   */
  @Override
  public FulfilmentResponse getFulfilment(Long id) {
    Fulfiment productPricing = fulfilmentRepository.findById(id).orElseThrow(FulfilmentNotFoundException::new);
    return setFulfilmentResponse(convertModelToDto(productPricing));
  }

  private FulfilmentResponse setFulfilmentResponse(FulfilmentDTO fulfilmentDTO){
    return new FulfilmentResponse(fulfilmentDTO);
  }
  private FulfilmentDTO convertModelToDto (Fulfiment fulfiment){
    return this.modelMapper.map(fulfiment, FulfilmentDTO.class);
  }
  private Fulfiment convertDtoToModel (FulfilmentDTO productPricingDTO){
      return this.modelMapper.map(productPricingDTO, Fulfiment.class);
  }

}
