package treeset;

import java.util.Comparator;
import java.util.zip.Inflater;
public class CompareOnId  implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		int diff = b1.getBookId() - b2.getBookId();
		return diff;
	}

}
