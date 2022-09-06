package printwriter;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws Exception {
		 String data = "When you reach the end of your rope, tie a knot in it and hang on........";

		    try {
		      PrintWriter output = new PrintWriter("sample.txt");
		      System.out.println("print");

		      output.print(data);
		      output.close();
		    }
		    catch(Exception e) {
		      e.getStackTrace();
		    }
	}
}