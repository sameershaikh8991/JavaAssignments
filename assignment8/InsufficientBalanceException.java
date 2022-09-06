package assignment8;

public class InsufficientBalanceException extends Exception {
	private String description;

	   //constructor
	   public InsufficientBalanceException(){ 
	          description="Insufficient Balance";
	   }

	   // parameterized constructor
	   public InsufficientBalanceException(String description) {
		   this.description=description;
	     
	   }

	@Override
	public String toString() {
		return "InsufficientBalanceException [description=" + description + "]";
	}

}
