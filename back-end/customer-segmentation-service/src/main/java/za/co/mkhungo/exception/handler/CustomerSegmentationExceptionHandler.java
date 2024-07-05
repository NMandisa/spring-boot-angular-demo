package za.co.mkhungo.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import za.co.mkhungo.exception.CustomerSegmentationException;
import za.co.mkhungo.exception.CustomerSegmentationNotFoundException;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Noxolo.Mkhungo
 */
@RestControllerAdvice(annotations ={RestController.class})
@Order(Ordered.HIGHEST_PRECEDENCE)
@Slf4j
public class CustomerSegmentationExceptionHandler {
  @ExceptionHandler(value = {CustomerSegmentationException.class})
  public final ResponseEntity<?> handleCustomerSegmentation(CustomerSegmentationException ex) {
    Map< String, Object > response=new LinkedHashMap<>();
    response.put("exception-cause",ex.getCause());
    response.put("message",ex.getLocalizedMessage());
    response.put("trace",ex.getStackTrace());
    return new ResponseEntity<>(response,null, HttpStatus.INTERNAL_SERVER_ERROR);//500
  }
  @ExceptionHandler(value = {CustomerSegmentationNotFoundException.class})
  public final ResponseEntity<?> handleCustomerSegmentationNotFoundException(CustomerSegmentationNotFoundException ex) {
    Map< String, Object > response=new LinkedHashMap<>();
    response.put("exception-cause",ex.getCause());
    response.put("message",ex.getLocalizedMessage());
    response.put("trace",ex.getStackTrace());
    return new ResponseEntity<>(response,null, HttpStatus.NOT_FOUND);//404
  }
}
