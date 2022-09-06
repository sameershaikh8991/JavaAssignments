package assignment8;


public class InputMismatchException extends RuntimeException {
private String description;
	
	public InputMismatchException() {
			description="enter only number format";
	}
	public InputMismatchException(String description) {
		this.description=description;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return getClass()+":"+description; // similar to builtin exception, u can return any string as a representation of object
	}
}