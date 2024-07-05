package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class StoreLocatorException extends RuntimeException implements Serializable {
  public StoreLocatorException() {super();}
  public StoreLocatorException(String message) {super(message);}
  public StoreLocatorException(String message, Throwable cause) {super(message,cause);}
}
