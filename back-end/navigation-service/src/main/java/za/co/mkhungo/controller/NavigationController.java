package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.NavigationURIConstants;
import za.co.mkhungo.dto.NavigationDTO;
import za.co.mkhungo.request.NavigationRequest;
import za.co.mkhungo.service.NavigationService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(NavigationURIConstants.NAVIGATION_REST_MAPPING)
@Slf4j
public class NavigationController {
  private final NavigationService navigationService;
  public NavigationController(@Qualifier("defaultNavigationService") NavigationService navigationService){
    this.navigationService=navigationService;
  }
  @GetMapping(value = NavigationURIConstants.GET_ALL_NAVIGATION)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = NavigationURIConstants.CREATE_NAVIGATION)
  public ResponseEntity <?> create(@RequestBody NavigationRequest cartRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PatchMapping(value = NavigationURIConstants.PATCH_NAVIGATION)
  public ResponseEntity <?> update(@RequestBody NavigationDTO dto, @PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @PostMapping(value = NavigationURIConstants.GET_NAVIGATION)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = NavigationURIConstants.DELETE_NAVIGATION)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
