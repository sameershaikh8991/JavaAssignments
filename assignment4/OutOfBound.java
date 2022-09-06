package assignment4;

import java.util.Scanner;

public class OutOfBound {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		int[] array = {1,2,3,4,5,6,7};
		System.out.print("Enter the index to return element: ");
		n = sc.nextInt();
		try {
			int val = array[n];
			System.out.println("val:"+val);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("enter number is from 0 to 6");
		}
		

	}
}