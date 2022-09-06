package treeset;

import java.util.Comparator;

public class CompareOnPrice implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		double diff=b1.getBookPrice()-b2.getBookPrice();
		return (int)diff;
	}

}