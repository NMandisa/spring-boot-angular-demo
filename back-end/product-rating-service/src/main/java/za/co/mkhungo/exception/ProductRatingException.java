package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class ProductRatingException extends RuntimeException implements Serializable {
  public ProductRatingException() {super();}
  public ProductRatingException(String message) {super(message);}
  public ProductRatingException(String message, Throwable cause) {super(message,cause);}
}
