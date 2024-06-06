package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class NavigationException extends RuntimeException implements Serializable {
  public NavigationException() {super();}
  public NavigationException(String message) {super(message);}
  public NavigationException(String message, Throwable cause) {super(message,cause);}
}
