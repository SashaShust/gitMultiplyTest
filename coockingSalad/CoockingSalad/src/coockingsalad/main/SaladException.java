package coockingsalad.main;

public class SaladException extends Exception{
	private String message;

	public SaladException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
