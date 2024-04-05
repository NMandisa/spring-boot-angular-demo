package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.BrandURIConstants;
import za.co.mkhungo.request.BrandRequest;
import za.co.mkhungo.service.BrandService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(BrandURIConstants.BRAND_REST_MAPPING)
@Slf4j
public class BrandController {
  private final BrandService brandService;
  @SuppressWarnings("unsed")
  public BrandController(@Qualifier("defaultBrandService") BrandService brandService){
    this.brandService=brandService;
  }
  @GetMapping(value = BrandURIConstants.GET_ALL_BRANDS)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = BrandURIConstants.CREATE_BRAND)
  public ResponseEntity <?> create(@RequestBody BrandRequest brandRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PostMapping(value = BrandURIConstants.GET_BRAND)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = BrandURIConstants.DELETE_BRAND)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
