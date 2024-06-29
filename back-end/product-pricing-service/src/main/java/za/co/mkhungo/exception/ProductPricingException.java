package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class ProductPricingException extends RuntimeException implements Serializable {
  public ProductPricingException() {super();}
  public ProductPricingException(String message) {super(message);}
  public ProductPricingException(String message, Throwable cause) {super(message,cause);}
}
