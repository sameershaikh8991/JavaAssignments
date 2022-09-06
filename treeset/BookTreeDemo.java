package treeset;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
import java.util.TreeSet;


public class BookTreeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		ArrayList<Book> b1 = new ArrayList<Book>();
		b1.add(new Book(2,"Java",600));
		b1.add(new Book(1,"PHP",300));
		b1.add(new Book(12,"CPP",400));
		b1.add(new Book(10,"Core Java",600));
		b1.add(new Book(13,"Java Basics",700));
		b1.add(new Book(15,"Learn Python",650));
		b1.add(new Book(14,"Web Basics",550));
//		System.out.println(b1);
		for (Book bk : b1) {
			System.out.println(bk);
		}
		TreeSet<Book> book = null;
		
		do {
			System.out.println("Enter for sorting book by:\n1 for Id \n2 for Price \n3 for Name \n4 for exit  ");
			choice = sc.nextInt();
 
			switch (choice) {
				case 1:
					book = new TreeSet<Book>(new CompareOnId());

					book.add(new Book(2,"Java",600));
					book.add(new Book(1,"PHP",300));
					book.add(new Book(12,"CPP",400));
					book.add(new Book(10,"Core Java",600));
					book.add(new Book(13,"Java Basics",700));
					book.add(new Book(15,"Learn Python",650));
					book.add(new Book(14,"Web Basics",550));
			
					for (Book bk : book) {
						System.out.println(bk);
					}
					break;
				case 2:
					book = new TreeSet<Book>(new CompareOnPrice());

					book.add(new Book(2,"Java",600));
					book.add(new Book(1,"PHP",300));
					book.add(new Book(12,"CPP",400));
					book.add(new Book(10,"Core Java",600));
					book.add(new Book(13,"Java Basics",700));
					book.add(new Book(15,"Learn Python",650));
					book.add(new Book(14,"Web Basics",550));
					
					for (Book bk : book) {
						System.out.println(bk);
					}
					break;

				case 3:
					book = new TreeSet<Book>(new CompareOnName());

					book.add(new Book(2,"Java",600));
					book.add(new Book(1,"PHP",300));
					book.add(new Book(12,"CPP",400));
					book.add(new Book(10,"Core Java",600));
					book.add(new Book(13,"Java Basics",700));
					book.add(new Book(15,"Learn Python",650));
					book.add(new Book(14,"Web Basics",550));
		
					for (Book bk : book) {
						System.out.println(bk);
					}
					break;
				default:
					break;
			}
			
		} while (choice != 4);	
		sc.close();
	}
}