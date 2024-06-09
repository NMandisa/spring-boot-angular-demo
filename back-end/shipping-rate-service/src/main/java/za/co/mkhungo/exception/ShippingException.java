package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class ShippingException extends RuntimeException implements Serializable {
  public ShippingException() {super();}
  public ShippingException(String message) {super(message);}
  public ShippingException(String message, Throwable cause) {super(message,cause);}
}
