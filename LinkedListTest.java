import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Contact> staff = new LinkedList<Contact>();
		
		Contact c1= new Contact("Toyota", 984564620, "toyo@bmail.com");
		
		staff.add(new Contact("Ferrari", 986464466, "Ferr@gmail.com"));
		
		staff.add(new Contact("Mistibishi", 986433466, "mist@gmail.com"));
		staff.add(c1);
		
		Iterator<Contact> itr = staff.iterator();
		while(itr.hasNext())
		{
			Contact con = itr.next();
			System.out.println("Contacts "+ con);
		}
		
	}

}

class Contact
{
	String contactName;
	long mobileNumber;
	String email;
	public Contact(String contactName, long mobileNumber, String email) {
		super();
		this.contactName = contactName;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contact [contactName=" + contactName + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}
	
	
}
