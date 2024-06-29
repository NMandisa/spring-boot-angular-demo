package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class ProductPricingNotFoundException extends RuntimeException implements Serializable {
  public ProductPricingNotFoundException() {super();}
  public ProductPricingNotFoundException(String message) {super(message);}
  public ProductPricingNotFoundException(String message, Throwable cause) {super(message,cause);}
}
