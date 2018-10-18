package exceptions;

public class ReplaceFailedException extends Exception {

	public ReplaceFailedException() {
		super();
	}

	public ReplaceFailedException(String message, Throwable cause) {
		super(message, cause);
	}

	public ReplaceFailedException(String message) {
		super(message);
	}

	public ReplaceFailedException(Throwable cause) {
		super(cause);
	}

}
