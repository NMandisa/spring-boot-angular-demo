package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class WarehouseException extends RuntimeException implements Serializable {
  public WarehouseException() {super();}
  public WarehouseException(String message) {super(message);}
  public WarehouseException(String message, Throwable cause) {super(message,cause);}
}
