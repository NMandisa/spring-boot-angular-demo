package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.CartURIConstants;
import za.co.mkhungo.request.CartRequest;
import za.co.mkhungo.service.CartService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(CartURIConstants.CART_REST_MAPPING)
@Slf4j
public class CartController {
  private final CartService cartService;
  public CartController(@Qualifier("defaultCartService") CartService cartService){
    this.cartService=cartService;
  }
  @GetMapping(value = CartURIConstants.GET_ALL_CARTS)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = CartURIConstants.CREATE_CART)
  public ResponseEntity <?> create(@RequestBody CartRequest cartRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PostMapping(value = CartURIConstants.GET_CART)
  public ResponseEntity<?> getTestById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = CartURIConstants.DELETE_CART)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
