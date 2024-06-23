package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.hateoas.server.core.ControllerEntityLinks;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.ProductURIConstants;
import za.co.mkhungo.request.ProductRequest;
import za.co.mkhungo.response.ProductResponse;
import za.co.mkhungo.service.ProductService;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
//@EnableCompression
@RestController
@RequestMapping(ProductURIConstants.PRODUCT_REST_MAPPING)
@Slf4j
public class ProductController {
  private final ProductService productService;
  public ProductController(@Qualifier("defaultProductService") ProductService productService){
    this.productService=productService;
  }
  @GetMapping(value = ProductURIConstants.GET_ALL_PRODUCTS)
  public ResponseEntity<Collection<ProductResponse>> list (){
   // WebMvcLinkBuilder
    return new ResponseEntity<>(productService.getProducts(),null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = ProductURIConstants.CREATE_PRODUCT)
  public ResponseEntity <?> create(@RequestBody ProductRequest productRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PostMapping(value = ProductURIConstants.GET_PRODUCT)
  public ResponseEntity<ProductResponse> getById(@PathVariable("id") Long id){
    ProductResponse productResponse = productService.getProduct(id);
    log.info("Product Response --> {} class : {} ",productResponse,ProductController.class);
    return new ResponseEntity<>(productResponse,null, HttpStatus.OK);
  }
  @DeleteMapping(value = ProductURIConstants.DELETE_PRODUCT)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
