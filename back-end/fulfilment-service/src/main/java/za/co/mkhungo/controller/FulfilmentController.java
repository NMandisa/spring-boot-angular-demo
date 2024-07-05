package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.request.FulfilmentRequest;
import za.co.mkhungo.response.FulfilmentResponse;
import za.co.mkhungo.service.FulfilmentService;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
//@EnableCompression
@RestController
@RequestMapping("fulfilment")
@Slf4j
public class FulfilmentController {
  private final FulfilmentService fulfilmentService;
  public FulfilmentController(@Qualifier("defaultFulfilmentService") FulfilmentService fulfilmentService){
    this.fulfilmentService=fulfilmentService;
  }
  @GetMapping(value = "/")
  public ResponseEntity<Collection<FulfilmentResponse>> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = "/")
  public ResponseEntity <FulfilmentResponse> create(@RequestBody FulfilmentRequest fulfilmentRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PostMapping(value = "/id")
  public ResponseEntity<FulfilmentResponse> getById(@PathVariable("id") Long id){
    //FulfilmentResponse fulfilmentResponse =
    log.info("Product Response --> {} class : {} ",new FulfilmentResponse(), FulfilmentController.class);
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }

}
