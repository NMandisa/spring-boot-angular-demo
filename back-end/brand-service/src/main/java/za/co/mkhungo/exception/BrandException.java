package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class BrandException extends RuntimeException implements Serializable {
  public BrandException() {super();}
  public BrandException(String message) {super(message);}
  public BrandException(String message, Throwable cause) {super(message,cause);}
}
