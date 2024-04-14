package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class StockException extends RuntimeException implements Serializable {
  public StockException() {super();}
  public StockException(String message) {super(message);}
  public StockException(String message, Throwable cause) {super(message,cause);}
}
