/**
 * 
 */
package dev.exception;

/**
 * @author ETY8
 *
 */
public class CalculException extends RuntimeException {

	public CalculException() {
		super();

	}

	public CalculException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public CalculException(String message, Throwable cause) {
		super(message, cause);

	}

	public CalculException(String message) {
		super(message);

	}

	public CalculException(Throwable cause) {
		super(cause);

	}

		
}
