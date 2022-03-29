import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 bk = new Book1(113, "Oracle", "xxxxxxxx", 4, LocalDate.now());
		HashSet<Book1> bookObj = new HashSet<Book1>();
		bookObj.add(new Book1(110,"Java","James Gousling",3,LocalDate.now()));
		bookObj.add(new Book1(111,".NET","xxxxxxxxxx",2,LocalDate.now()));
		bookObj.add(new Book1(112,"Ramayana","Kuvempu",1,LocalDate.now()));
		bookObj.add(bk);
		bookObj.add(new Book1(109,"C","Richee",7,LocalDate.now()));
		bookObj.add(new Book1(109,"C++","Richee",7,LocalDate.now()));
		bookObj.add(new Book1(112,"MahaBaratha","Kuvempu",1,LocalDate.now()));
		Iterator<Book1> itr = bookObj.iterator();
		while(itr.hasNext())
		{
			Book1 bkItr = itr.next();
			System.out.println("Book Collection "+ bkItr);
			
		}

	}

}

class Book1 implements Comparator<Book1>
{
	int bookNumber;
	String bookName;
	String bookAuthor;
	int bookEdition;
	LocalDate bookPublicationDate;
	
	
	
		public Book1(int bookNumber, String bookName, String bookAuthor, int bookEdition, LocalDate bookPublicationDate) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookEdition = bookEdition;
		this.bookPublicationDate = bookPublicationDate;
	}
	
		@Override
		public String toString() {
			return "Book1 [bookNumber=" + bookNumber + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor
					+ ", bookEdition=" + bookEdition + ", bookPublicationDate=" + bookPublicationDate + "]";
		}
		


		@Override
		public int hashCode() {
			return Objects.hash(bookNumber);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book1 other = (Book1) obj;
			return bookNumber == other.bookNumber;
		}

		@Override
		public int compare(Book1 o1, Book1 o2) {
			// TODO Auto-generated method stub
			System.out.println(o1.bookNumber+" comparing with"+ o2.bookNumber);
			return Integer.compare(o1.bookNumber, o2.bookNumber);
		}
	
	
}
