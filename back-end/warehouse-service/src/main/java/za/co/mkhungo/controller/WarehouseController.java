package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.WarehouseURIConstants;
import za.co.mkhungo.request.WarehouseRequest;
import za.co.mkhungo.service.WarehouseService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(WarehouseURIConstants.WAREHOUSE_REST_MAPPING)
@Slf4j
public class WarehouseController {
  private final WarehouseService cartService;
  public WarehouseController(@Qualifier("defaultWarehouseService") WarehouseService cartService){
    this.cartService=cartService;
  }
  @GetMapping(value = WarehouseURIConstants.GET_ALL_WAREHOUSE)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = WarehouseURIConstants.CREATE_WAREHOUSE)
  public ResponseEntity <?> create(@RequestBody WarehouseRequest warehouseRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PostMapping(value = WarehouseURIConstants.GET_WAREHOUSE)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }

  @PatchMapping(value = WarehouseURIConstants.PATCH_WAREHOUSE)
  public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody WarehouseRequest warehouseRequest){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = WarehouseURIConstants.DELETE_WAREHOUSE)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
