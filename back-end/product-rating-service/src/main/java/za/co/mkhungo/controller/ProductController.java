package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.ProductRatingURIConstants;
import za.co.mkhungo.request.ProductRatingRequest;
import za.co.mkhungo.service.ProductRatingService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(ProductRatingURIConstants.PRODUCT_RATING_REST_MAPPING)
@Slf4j
public class ProductController {
  private final ProductRatingService productService;
  public ProductController(@Qualifier("defaultProductRatingService") ProductRatingService productService){
      this.productService=productService;
  }
  @GetMapping(value = ProductRatingURIConstants.GET_ALL_PRODUCT_RATINGS)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(productService.getProductRatings(),null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = ProductRatingURIConstants.CREATE_PRODUCT_RATING)
  public ResponseEntity <?> create(@RequestBody ProductRatingRequest productRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PostMapping(value = ProductRatingURIConstants.GET_PRODUCT_RATING)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = ProductRatingURIConstants.DELETE_PRODUCT_RATING)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
