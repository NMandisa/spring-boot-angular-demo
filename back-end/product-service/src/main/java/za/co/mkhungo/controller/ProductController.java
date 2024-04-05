package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.ProductURIConstants;
import za.co.mkhungo.request.ProductRequest;
import za.co.mkhungo.service.ProductService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(ProductURIConstants.PRODUCT_REST_MAPPING)
@Slf4j
public class ProductController {
  private final ProductService productService;
  public ProductController(@Qualifier("defaultProductService") ProductService productService){
      this.productService=productService;
  }
  @GetMapping(value = ProductURIConstants.GET_ALL_PRODUCTS)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = ProductURIConstants.CREATE_PRODUCT)
  public ResponseEntity <?> create(@RequestBody ProductRequest productRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PostMapping(value = ProductURIConstants.GET_PRODUCT)
  public ResponseEntity<?> getTestById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = ProductURIConstants.DELETE_PRODUCT)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}