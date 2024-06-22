package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class ProductImageNotFoundException extends RuntimeException implements Serializable {
  public ProductImageNotFoundException() {super();}
  public ProductImageNotFoundException(String message) {super(message);}
  public ProductImageNotFoundException(String message, Throwable cause) {super(message,cause);}
}
