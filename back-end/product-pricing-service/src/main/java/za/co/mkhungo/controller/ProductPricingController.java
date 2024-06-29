package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.request.ProductPricingRequest;
import za.co.mkhungo.response.ProductPricingResponse;
import za.co.mkhungo.service.ProductPricingService;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
//@EnableCompression
@RestController
@RequestMapping("product-pricing")
@Slf4j
public class ProductPricingController {
  private final ProductPricingService productPricingService;
  public ProductPricingController(@Qualifier("defaultProductPricingService") ProductPricingService productPricingService){
    this.productPricingService=productPricingService;
  }
  @GetMapping(value = "/")
  public ResponseEntity<Collection<ProductPricingResponse>> list (){
    return new ResponseEntity<>(productPricingService.getProductsPrices(),null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = "/")
  public ResponseEntity <?> create(@RequestBody ProductPricingRequest productPricingRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PostMapping(value = "/id")
  public ResponseEntity<ProductPricingResponse> getById(@PathVariable("id") Long id){
    ProductPricingResponse productPricingResponse = productPricingService.getProductPrice(id);
    log.info("Product Response --> {} class : {} ",productPricingResponse, ProductPricingController.class);
    return new ResponseEntity<>(productPricingResponse,null, HttpStatus.OK);
  }

}
