package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class ProductReviewException extends RuntimeException implements Serializable {
  public ProductReviewException() {super();}
  public ProductReviewException(String message) {super(message);}
  public ProductReviewException(String message, Throwable cause) {super(message,cause);}
}
