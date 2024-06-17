package za.co.mkhungo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.mkhungo.common.response.ProductResponse;

import java.util.Collection;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping("product-search")
@Slf4j
public class ProductSearchController {
    @GetMapping//search query
    public ResponseEntity<Collection<ProductResponse>> search (){
        return new ResponseEntity<>(null,null, HttpStatus.OK);
    }
}
