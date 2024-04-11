package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.ProductDescriptionURIConstants;
import za.co.mkhungo.request.ProductDescriptionRequest;
import za.co.mkhungo.service.ProductDescriptionService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(ProductDescriptionURIConstants.PRODUCT_REST_MAPPING)
@Slf4j
public class ProductDescriptionController {
  private final ProductDescriptionService productDescriptionService;
  public ProductDescriptionController(@Qualifier("defaultProductDescriptionService") ProductDescriptionService productDescriptionService){
      this.productDescriptionService=productDescriptionService;
  }
  @GetMapping(value = ProductDescriptionURIConstants.GET_ALL_PRODUCT_DESCRIPTIONS)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(productDescriptionService.getProductDescriptions(),null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = ProductDescriptionURIConstants.CREATE_PRODUCT_DESCRIPTION)
  public ResponseEntity <?> create(@RequestBody ProductDescriptionRequest productRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PostMapping(value = ProductDescriptionURIConstants.GET_PRODUCT_DESCRIPTION)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = ProductDescriptionURIConstants.DELETE_PRODUCT_DESCRIPTION)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
