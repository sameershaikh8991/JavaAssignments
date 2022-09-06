package assignment8;

public class NegativeAmountEnterException extends Exception {
	private String description;

	   //constructor
	   public  NegativeAmountEnterException(){ 
	          description="Negative amount Enter";
	   }

	   // parameterized constructor
	   public  NegativeAmountEnterException(String description) {
		   this.description=description;
	     
	   }

	@Override
	public String toString() {
		return "NegativeAmountEnterException [description=" + description + "]";
	}

}
