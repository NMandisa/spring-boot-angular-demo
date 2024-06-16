package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class ProductDescriptionNotFoundException extends RuntimeException implements Serializable {
  public ProductDescriptionNotFoundException() {super();}
  public ProductDescriptionNotFoundException(String message) {super(message);}
  public ProductDescriptionNotFoundException(String message, Throwable cause) {super(message,cause);}
}
