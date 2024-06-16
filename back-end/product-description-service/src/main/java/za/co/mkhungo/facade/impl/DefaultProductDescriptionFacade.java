package za.co.mkhungo.facade.impl;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import za.co.mkhungo.domain.ProductDescription;
import za.co.mkhungo.dto.ProductDescriptionDTO;
import za.co.mkhungo.exception.ProductDescriptionNotFoundException;
import za.co.mkhungo.facade.ProductDescriptionFacade;
import za.co.mkhungo.proxy.ProductProxy;
import za.co.mkhungo.repository.ProductDescriptionRepository;
import za.co.mkhungo.response.ProductDescriptionResponse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@Slf4j
public class DefaultProductDescriptionFacade implements ProductDescriptionFacade {
  private ProductDescriptionRepository productDescriptionRepository;
  private ProductProxy productProxy;
  protected final ModelMapper modelMapper;
  @Autowired
  public DefaultProductDescriptionFacade(ProductDescriptionRepository productDescriptionRepository,ModelMapper modelMapper) {
    this.productDescriptionRepository = productDescriptionRepository;
    this.modelMapper=modelMapper;
  }

  @Override
  public Collection<ProductDescriptionResponse> productDescriptions() {
    List<ProductDescriptionResponse> productResponse=new ArrayList<>();
    List<ProductDescription> productDescriptions= productDescriptionRepository.findAll();
    productDescriptions.forEach(productDescription -> {
      log.info("Product Description : {}", productDescription);
      productResponse.add(setProductResponse(convertModelToDto(productDescription)));
    });
    return productResponse;
  }
  @Override
  public ProductDescriptionResponse getProductDescriptionResponse(Long id) {
    ProductDescription productDescription = productDescriptionRepository.findById(id).orElseThrow(ProductDescriptionNotFoundException::new);
    log.info("get product description --? {} class :{}",productDescription,ProductDescriptionFacade.class);
    return setProductResponse(convertModelToDto(productDescription));
  }
  private ProductDescriptionResponse setProductResponse(ProductDescriptionDTO productDescriptionDTO){
    log.info("set product description dto --? {} class --> {}",productDescriptionDTO,ProductDescriptionFacade.class);
    return new ProductDescriptionResponse(productDescriptionDTO);
  }
  private ProductDescriptionDTO convertModelToDto (ProductDescription productDescription){
    log.info(" convertModelToDto --> Product Description Model {} ==> class {}",productDescription,ProductDescriptionFacade.class);
    return this.modelMapper.map(productDescription, ProductDescriptionDTO.class);
  }
  private ProductDescription convertDtoToModel (ProductDescriptionDTO productDescriptionDTO){
    log.info(" convertDtoToModel --> Product Description Data Transfer Object  {} ==> class {}",productDescriptionDTO,ProductDescriptionFacade.class);
    return this.modelMapper.map(productDescriptionDTO, ProductDescription.class);
  }
}