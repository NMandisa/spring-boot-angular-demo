package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class ProductException extends RuntimeException implements Serializable {
  public ProductException() {super();}
  public ProductException(String message) {super(message);}
  public ProductException(String message, Throwable cause) {super(message,cause);}
}
