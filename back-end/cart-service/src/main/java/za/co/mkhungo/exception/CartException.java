package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class CartException extends RuntimeException implements Serializable {
  public CartException() {super();}
  public CartException(String message) {super(message);}
  public CartException(String message, Throwable cause) {super(message,cause);}
}
