package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class CustomerSegmentationException extends RuntimeException implements Serializable {
  public CustomerSegmentationException() {super();}
  public CustomerSegmentationException(String message) {super(message);}
  public CustomerSegmentationException(String message, Throwable cause) {super(message,cause);}
}
