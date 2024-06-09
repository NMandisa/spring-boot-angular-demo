package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.CheckoutURIConstants;
import za.co.mkhungo.request.CheckoutRequest;
import za.co.mkhungo.service.CheckoutService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(CheckoutURIConstants.CHECKOUT_REST_MAPPING)
@Slf4j
public class CheckoutController {
  private final CheckoutService checkoutService;
  public CheckoutController(@Qualifier("defaultCheckoutService") CheckoutService checkoutService){
    this.checkoutService=checkoutService;
  }
  @GetMapping(value = CheckoutURIConstants.GET_ALL_CHECKOUT)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = CheckoutURIConstants.CREATE_CHECKOUT)
  public ResponseEntity <?> create(@RequestBody CheckoutRequest checkoutRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PatchMapping(value = CheckoutURIConstants.PATCH_CHECKOUT)
  public ResponseEntity <?> update(@RequestBody CheckoutRequest checkoutRequest, @PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @PostMapping(value = CheckoutURIConstants.GET_CHECKOUT)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = CheckoutURIConstants.DELETE_CHECKOUT)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
