package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class CatalogItemException extends RuntimeException implements Serializable {
  public CatalogItemException() {super();}
  public CatalogItemException(String message) {super(message);}
  public CatalogItemException(String message, Throwable cause) {super(message,cause);}
}
