package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class CategoryException extends RuntimeException implements Serializable {
  public CategoryException() {super();}
  public CategoryException(String message) {super(message);}
  public CategoryException(String message, Throwable cause) {super(message,cause);}
}
