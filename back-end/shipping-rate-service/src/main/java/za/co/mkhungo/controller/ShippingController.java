package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.ShippingURIConstants;
import za.co.mkhungo.request.ShippingRequest;
import za.co.mkhungo.service.ShippingService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(ShippingURIConstants.SHIPPING_REST_MAPPING)
@Slf4j
public class ShippingController {
  private final ShippingService shippingService;
  public ShippingController(@Qualifier("defaultShippingService") ShippingService shippingService){
    this.shippingService=shippingService;
  }
  @GetMapping(value = ShippingURIConstants.GET_ALL_SHIPPING)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = ShippingURIConstants.CREATE_SHIPPING)
  public ResponseEntity <?> create(@RequestBody ShippingRequest orderRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PatchMapping(value = ShippingURIConstants.PATCH_SHIPPING)
  public ResponseEntity <?> update(@RequestBody ShippingRequest orderRequest, @PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @PostMapping(value = ShippingURIConstants.GET_SHIPPING)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = ShippingURIConstants.DELETE_SHIPPING)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
