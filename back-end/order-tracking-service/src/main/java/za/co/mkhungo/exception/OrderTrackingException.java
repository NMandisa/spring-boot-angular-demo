package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class OrderTrackingException extends RuntimeException implements Serializable {
  public OrderTrackingException() {super();}
  public OrderTrackingException(String message) {super(message);}
  public OrderTrackingException(String message, Throwable cause) {super(message,cause);}
}
