package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.ProductReviewURIConstants;
import za.co.mkhungo.request.ProductReviewRequest;
import za.co.mkhungo.service.ProductReviewService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(ProductReviewURIConstants.PRODUCT_REVIEW_REST_MAPPING)
@Slf4j
public class ProductReviewController {
  private final ProductReviewService productService;
  public ProductReviewController(@Qualifier("defaultProductReviewService") ProductReviewService productService){
      this.productService=productService;
  }
  @GetMapping(value = ProductReviewURIConstants.GET_ALL_PRODUCT_REVIEWS)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(productService.getProductReviews(),null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = ProductReviewURIConstants.CREATE_PRODUCT_REVIEW)
  public ResponseEntity <?> create(@RequestBody ProductReviewRequest productRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PostMapping(value = ProductReviewURIConstants.GET_PRODUCT_REVIEW)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = ProductReviewURIConstants.DELETE_PRODUCT_REVIEW)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
