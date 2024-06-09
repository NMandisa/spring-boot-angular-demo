package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.CustomerURIConstants;
import za.co.mkhungo.dto.CustomerDTO;
import za.co.mkhungo.request.CustomerRequest;
import za.co.mkhungo.service.CustomerService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(CustomerURIConstants.CUSTOMER_REST_MAPPING)
@Slf4j
public class CustomerController {
  private final CustomerService customerService;
  public CustomerController(@Qualifier("defaultCustomerService") CustomerService customerService){
    this.customerService=customerService;
  }
  @GetMapping(value = CustomerURIConstants.GET_ALL_CUSTOMERS)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = CustomerURIConstants.CREATE_CUSTOMER)
  public ResponseEntity <?> create(@RequestBody CustomerRequest cartRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PatchMapping(value = CustomerURIConstants.PATCH_CUSTOMER)
  public ResponseEntity <?> update(@RequestBody CustomerRequest customerRequest, @PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @PostMapping(value = CustomerURIConstants.GET_CUSTOMER)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = CustomerURIConstants.DELETE_CUSTOMER)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
