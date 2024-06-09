package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.OrderFulfilmentURIConstants;
import za.co.mkhungo.request.OrderFulfilmentRequest;
import za.co.mkhungo.service.OrderFulfilmentService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(OrderFulfilmentURIConstants.ORDER_FULFILMENT_REST_MAPPING)
@Slf4j
public class OrderFulfilmentController {
  private final OrderFulfilmentService orderFulfilmentService;
  public OrderFulfilmentController(@Qualifier("defaultOrderFulfilmentService") OrderFulfilmentService orderFulfilmentService){
    this.orderFulfilmentService=orderFulfilmentService;
  }
  @GetMapping(value = OrderFulfilmentURIConstants.GET_ALL_ORDER_FULFILMENT)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = OrderFulfilmentURIConstants.CREATE_ORDER_FULFILMENT)
  public ResponseEntity <?> create(@RequestBody OrderFulfilmentRequest orderRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PatchMapping(value = OrderFulfilmentURIConstants.PATCH_ORDER_FULFILMENT)
  public ResponseEntity <?> update(@RequestBody OrderFulfilmentRequest orderRequest, @PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @PostMapping(value = OrderFulfilmentURIConstants.GET_ORDER_FULFILMENT)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = OrderFulfilmentURIConstants.DELETE_ORDER_FULFILMENT)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
