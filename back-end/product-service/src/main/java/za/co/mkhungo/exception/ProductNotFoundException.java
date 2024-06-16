package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class ProductNotFoundException extends RuntimeException implements Serializable {
  public ProductNotFoundException() {super();}
  public ProductNotFoundException(String message) {super(message);}
  public ProductNotFoundException(String message, Throwable cause) {super(message,cause);}
}
