package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class FulfilmentException extends RuntimeException implements Serializable {
  public FulfilmentException() {super();}
  public FulfilmentException(String message) {super(message);}
  public FulfilmentException(String message, Throwable cause) {super(message,cause);}
}
