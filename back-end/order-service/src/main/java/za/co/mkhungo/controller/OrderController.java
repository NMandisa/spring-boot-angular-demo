package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.OrderURIConstants;
import za.co.mkhungo.request.OrderRequest;
import za.co.mkhungo.service.OrderService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(OrderURIConstants.ORDER_REST_MAPPING)
@Slf4j
public class OrderController {
  private final OrderService orderService;
  public OrderController(@Qualifier("defaultOrderService") OrderService orderService){
    this.orderService=orderService;
  }
  @GetMapping(value = OrderURIConstants.GET_ALL_ORDERS)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = OrderURIConstants.CREATE_ORDER)
  public ResponseEntity <?> create(@RequestBody OrderRequest orderRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PatchMapping(value = OrderURIConstants.PATCH_ORDER)
  public ResponseEntity <?> update(@RequestBody OrderRequest orderRequest, @PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @PostMapping(value = OrderURIConstants.GET_ORDER)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = OrderURIConstants.DELETE_ORDER)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
