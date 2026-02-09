package restAPI;

public class UnderAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public UnderAgeException() {
		super("Parent is too young");
		// TODO Auto-generated constructor stub
	}

	public UnderAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UnderAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public UnderAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UnderAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
