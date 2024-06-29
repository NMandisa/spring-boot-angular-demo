package za.co.mkhungo.facade.impl;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mkhungo.domain.ProductPricing;
import za.co.mkhungo.dto.ProductPricingDTO;
import za.co.mkhungo.exception.ProductPricingNotFoundException;
import za.co.mkhungo.facade.ProductPricingFacade;
import za.co.mkhungo.repository.ProductPricingRepository;
import za.co.mkhungo.response.ProductPricingResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@Slf4j
public class DefaultProductPricingFacade implements ProductPricingFacade {
  private final ProductPricingRepository productPricingRepository;
  private final ModelMapper modelMapper;
  @Autowired
  public DefaultProductPricingFacade(ProductPricingRepository productPricingRepository,ModelMapper modelMapper) {
    this.productPricingRepository = productPricingRepository;
    this.modelMapper=modelMapper;
  }

  @Override
  public Collection<ProductPricingResponse> productsPricing() {
    List<ProductPricingResponse> productsPricingResponse=new ArrayList<>();
    List<ProductPricing> productsPricing = productPricingRepository.findAll();
    return productsPricingResponse;
}

  @Override
  public Long save(ProductPricing productPricing) {
    //triggers  product update or ...  we'll see what
    return productPricingRepository.save(productPricing).getId();
  }

  /**
   * @param id
   * @return
   */
  @Override
  public ProductPricingResponse getProductPricing(Long id) {
    ProductPricing productPricing = productPricingRepository.findById(id).orElseThrow(ProductPricingNotFoundException::new);
    return setProductPricingResponse(convertModelToDto(productPricing));
  }

  private ProductPricingResponse setProductPricingResponse(ProductPricingDTO productPricingDTO){
    return new ProductPricingResponse(productPricingDTO);
  }
  private ProductPricingDTO convertModelToDto (ProductPricing productPricing){
    return this.modelMapper.map(productPricing, ProductPricingDTO.class);
  }
  private ProductPricing convertDtoToModel (ProductPricingDTO productPricingDTO){
      return this.modelMapper.map(productPricingDTO, ProductPricing.class);
  }

}
