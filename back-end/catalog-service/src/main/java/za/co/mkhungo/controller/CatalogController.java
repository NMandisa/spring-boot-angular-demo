package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.CatalogURIConstants;
import za.co.mkhungo.request.CatalogRequest;
import za.co.mkhungo.service.CatalogService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(CatalogURIConstants.CATALOG_REST_MAPPING)
@Slf4j
public class CatalogController {
  private final CatalogService catalogService;
  public CatalogController(@Qualifier("defaultCatalogService") CatalogService catalogService){
    this.catalogService=catalogService;
  }
  @GetMapping(value = CatalogURIConstants.GET_ALL_CATALOGS)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = CatalogURIConstants.CREATE_CATALOG)
  public ResponseEntity <?> create(@RequestBody CatalogRequest catalogRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PostMapping(value = CatalogURIConstants.GET_CATALOG)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @PatchMapping(value = CatalogURIConstants.PATCH_CATALOG)
  public ResponseEntity <?> update(@RequestBody CatalogRequest catalogRequest, @PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = CatalogURIConstants.DELETE_CATALOG)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
