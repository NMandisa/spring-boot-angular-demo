package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class CheckoutException extends RuntimeException implements Serializable {
  public CheckoutException() {super();}
  public CheckoutException(String message) {super(message);}
  public CheckoutException(String message, Throwable cause) {super(message,cause);}
}
