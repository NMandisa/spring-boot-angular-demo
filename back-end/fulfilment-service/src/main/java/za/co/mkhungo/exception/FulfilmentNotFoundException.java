package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class FulfilmentNotFoundException extends RuntimeException implements Serializable {
  public FulfilmentNotFoundException() {super();}
  public FulfilmentNotFoundException(String message) {super(message);}
  public FulfilmentNotFoundException(String message, Throwable cause) {super(message,cause);}
}
