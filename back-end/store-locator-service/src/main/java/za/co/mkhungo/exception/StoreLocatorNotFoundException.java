package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class StoreLocatorNotFoundException extends RuntimeException implements Serializable {
  public StoreLocatorNotFoundException() {super();}
  public StoreLocatorNotFoundException(String message) {super(message);}
  public StoreLocatorNotFoundException(String message, Throwable cause) {super(message,cause);}
}
