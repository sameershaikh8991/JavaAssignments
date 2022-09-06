package assignment8;

public class InvalidAmountException extends Exception {
	private String description;

	   //constructor
	   public InvalidAmountException(){ 
	          description="Invalid amount";
	   }

	   // parameterized constructor
	   public InvalidAmountException(String description) {
		   this.description=description;
	     
	   }

	@Override
	public String toString() {
		return "InvalidAmountException [description=" + description + "]";
	}
	   

	}
