package mypack;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		{
	        int ar[] = { 1, 2, 3, 4, 5 };
	        try {
	            for (int i = 0; i <= ar.length; i++)
	                System.out.print(ar[i]+" ");
	        }
	        catch (IndexOutOfBoundsException e) {
	        	System.out.println(e);
	            System.out.println("\nException caught");
	            for (int i = 0; i <= ar.length; i++)
	                System.out.print(ar[i]+" ");
	        }
	    }
	}

}
