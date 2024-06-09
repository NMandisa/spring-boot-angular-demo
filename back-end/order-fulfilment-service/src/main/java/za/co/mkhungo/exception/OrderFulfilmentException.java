package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class OrderFulfilmentException extends RuntimeException implements Serializable {
  public OrderFulfilmentException() {super();}
  public OrderFulfilmentException(String message) {super(message);}
  public OrderFulfilmentException(String message, Throwable cause) {super(message,cause);}
}
