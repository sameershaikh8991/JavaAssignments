package assignment8;

public class InvalidException extends RuntimeException {
private String description;
	
	public InvalidException() {
			description="age below 18 is not valid";
	}
	public InvalidException(String description) {
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