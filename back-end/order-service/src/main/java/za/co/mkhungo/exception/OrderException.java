package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class OrderException extends RuntimeException implements Serializable {
  public OrderException() {super();}
  public OrderException(String message) {super(message);}
  public OrderException(String message, Throwable cause) {super(message,cause);}
}
