package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.StockURIConstants;
import za.co.mkhungo.request.StockRequest;
import za.co.mkhungo.service.StockService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(StockURIConstants.SROCK_REST_MAPPING)
@Slf4j
public class StockController {
  private final StockService cartService;
  public StockController(@Qualifier("defaultStockService") StockService cartService){
    this.cartService=cartService;
  }
  @GetMapping(value = StockURIConstants.GET_ALL_STOCKS)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = StockURIConstants.CREATE_STOCK)
  public ResponseEntity <?> create(@RequestBody StockRequest cartRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PostMapping(value = StockURIConstants.GET_STOCK)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @PatchMapping(value = StockURIConstants.PATCH_STOCK)
  public ResponseEntity<?> updateStock(@PathVariable("id") Long id, @RequestBody StockRequest stockRequest){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = StockURIConstants.DELETE_STOCK)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
