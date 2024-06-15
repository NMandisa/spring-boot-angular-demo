package za.co.mkhungo.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import za.co.mkhungo.exception.ProductRatingException;
import za.co.mkhungo.response.CustomErrorResponse;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Noxolo.Mkhungo
 */
@RestControllerAdvice(annotations ={RestController.class})
@Order(Ordered.HIGHEST_PRECEDENCE)
@Slf4j
public class ProductRatingExceptionHandler {
  @ExceptionHandler(value = {ProductRatingException.class})
  public final ResponseEntity<CustomErrorResponse> handleProductRatingException(ProductRatingException ex) {
    CustomErrorResponse customError = new CustomErrorResponse();
    /*customError.response("exception-cause",ex.getCause());
    customError.response("message",ex.getLocalizedMessage());
    customError.response("trace", Arrays.toString(ex.getStackTrace()));*/
    return new ResponseEntity<>(customError,null, HttpStatus.INTERNAL_SERVER_ERROR);//500
  }
}
