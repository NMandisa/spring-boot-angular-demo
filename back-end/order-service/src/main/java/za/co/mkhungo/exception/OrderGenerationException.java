package za.co.mkhungo.exception;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
public class OrderGenerationException extends RuntimeException implements Serializable {
    public OrderGenerationException() {super();}
    public OrderGenerationException(String message) {super(message);}
    public OrderGenerationException(String message, Throwable cause) {super(message,cause);}
}
