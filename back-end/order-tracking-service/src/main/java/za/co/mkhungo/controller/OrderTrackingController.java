package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.OrderTrackingURIConstants;
import za.co.mkhungo.request.OrderTrackingRequest;
import za.co.mkhungo.service.OrderTrackingService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(OrderTrackingURIConstants.ORDER_TRACKING_REST_MAPPING)
@Slf4j
public class OrderTrackingController {
  private final OrderTrackingService orderTrackingService;
  public OrderTrackingController(@Qualifier("defaultOrderTrackingService") OrderTrackingService orderTrackingService){
    this.orderTrackingService=orderTrackingService;
  }
  @GetMapping(value = OrderTrackingURIConstants.GET_ALL_ORDER_TRACKING)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = OrderTrackingURIConstants.CREATE_ORDER_TRACKING)
  public ResponseEntity <?> create(@RequestBody OrderTrackingRequest orderTrackingRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PatchMapping(value = OrderTrackingURIConstants.PATCH_ORDER_TRACKING)
  public ResponseEntity <?> update(@RequestBody OrderTrackingRequest orderTrackingRequest, @PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @PostMapping(value = OrderTrackingURIConstants.GET_ORDER_TRACKING)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = OrderTrackingURIConstants.DELETE_ORDER_TRACKING)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
