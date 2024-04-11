package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class ProductDescriptionException extends RuntimeException implements Serializable {
  public ProductDescriptionException() {super();}
  public ProductDescriptionException(String message) {super(message);}
  public ProductDescriptionException(String message, Throwable cause) {super(message,cause);}
}
