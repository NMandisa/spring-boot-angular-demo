package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class CatalogException extends RuntimeException implements Serializable {
  public CatalogException() {super();}
  public CatalogException(String message) {super(message);}
  public CatalogException(String message, Throwable cause) {super(message,cause);}
}
