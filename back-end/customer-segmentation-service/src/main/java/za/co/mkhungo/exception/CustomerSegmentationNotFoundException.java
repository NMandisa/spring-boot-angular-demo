package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class CustomerSegmentationNotFoundException extends RuntimeException implements Serializable {
  public CustomerSegmentationNotFoundException() {super();}
  public CustomerSegmentationNotFoundException(String message) {super(message);}
  public CustomerSegmentationNotFoundException(String message, Throwable cause) {super(message,cause);}
}
