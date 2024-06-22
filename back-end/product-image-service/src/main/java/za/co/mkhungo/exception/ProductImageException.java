package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class ProductImageException extends RuntimeException implements Serializable {
  public ProductImageException() {super();}
  public ProductImageException(String message) {super(message);}
  public ProductImageException(String message, Throwable cause) {super(message,cause);}
}
