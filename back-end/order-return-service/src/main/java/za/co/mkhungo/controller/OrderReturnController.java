package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.OrderReturnURIConstants;
import za.co.mkhungo.request.OrderReturnRequest;
import za.co.mkhungo.service.OrderReturnService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(OrderReturnURIConstants.ORDER_RETURN_REST_MAPPING)
@Slf4j
public class OrderReturnController {
  private final OrderReturnService orderReturnService;
  public OrderReturnController(@Qualifier("defaultOrderReturnService") OrderReturnService orderReturnService){
    this.orderReturnService=orderReturnService;
  }
  @GetMapping(value = OrderReturnURIConstants.GET_ALL_ORDER_RETURNS)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = OrderReturnURIConstants.CREATE_ORDER_RETURN)
  public ResponseEntity <?> create(@RequestBody OrderReturnRequest cartRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PatchMapping(value = OrderReturnURIConstants.PATCH_ORDER_RETURN)
  public ResponseEntity <?> update(@RequestBody OrderReturnRequest customerRequest, @PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @PostMapping(value = OrderReturnURIConstants.GET_ORDER_RETURN)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = OrderReturnURIConstants.DELETE_ORDER_RETURN)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
