package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class OrderReturnException extends RuntimeException implements Serializable {
  public OrderReturnException() {super();}
  public OrderReturnException(String message) {super(message);}
  public OrderReturnException(String message, Throwable cause) {super(message,cause);}
}
