package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.mkhungo.constants.CategoryURIConstants;
import za.co.mkhungo.request.CategoryRequest;
import za.co.mkhungo.service.CategoryService;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(CategoryURIConstants.CATEGORY_REST_MAPPING)
@Slf4j
public class CategoryController {
  private final CategoryService categoryService;
  public CategoryController(@Qualifier("defaultCategoryService") CategoryService categoryService){
    this.categoryService=categoryService;
  }
  @GetMapping(value = CategoryURIConstants.GET_ALL_CARTS)
  public ResponseEntity<?> list (){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
  @PostMapping(value = CategoryURIConstants.CREATE_CART)
  public ResponseEntity <?> create(@RequestBody CategoryRequest categoryRequest){
    return new ResponseEntity<>(null,null, HttpStatus.CREATED);
  }
  @PostMapping(value = CategoryURIConstants.GET_CART)
  public ResponseEntity<?> getById(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.OK);
  }
  @DeleteMapping(value = CategoryURIConstants.DELETE_CART)
  public ResponseEntity<?> remove(@PathVariable("id") Long id){
    return new ResponseEntity<>(null,null, HttpStatus.ACCEPTED);
  }
}
