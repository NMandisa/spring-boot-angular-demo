package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.CatalogItemURIConstants;
import za.co.mkhungo.request.CatalogItemRequest;
import za.co.mkhungo.service.CatalogItemService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(CatalogItemURIConstants.CATALOG_ITEM_REST_MAPPING)
@Slf4j
public class CatalogItemController {
  private final CatalogItemService catalogItemService;
  public CatalogItemController(@Qualifier("defaultCatalogItemService") CatalogItemService catalogItemService){
    this.catalogItemService=catalogItemService;
  }
  @GetMapping(value = CatalogItemURIConstants.GET_ALL_CATALOG_ITEMS)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = CatalogItemURIConstants.CREATE_CATALOG_ITEM)
  public ResponseEntity <?> create(@RequestBody CatalogItemRequest catalogItemRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PostMapping(value = CatalogItemURIConstants.GET_CATALOG_ITEM)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @PatchMapping(value = CatalogItemURIConstants.PATCH_CATALOG_ITEM)
  public ResponseEntity <?> update(@RequestBody CatalogItemRequest catalogItemRequest, @PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = CatalogItemURIConstants.DELETE_CATALOG_ITEM)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
