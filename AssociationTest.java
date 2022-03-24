
public class AssociationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kfc kfcObj = new Kfc();
		
		//System.out.println(kfcObj);
		Branch br = new Branch();
		kfcObj.account(br);
		
		Trading td = new Trading();
		kfcObj.payment(td);
		
		TwoWheeler tw = new TwoWheeler();
		kfcObj.delivery(tw);
		
		GasBill gb = new GasBill();
		kfcObj.consumptionBill(gb);
		
		Library lb = new Library();
		kfcObj.study(lb);
		
		Book bk = new Book();
		kfcObj.wrote(bk);
		
		ClassRoom cr = new ClassRoom();
		kfcObj.training(cr);
		
		Guiter g = new Guiter();
		kfcObj.entertain(g);
		
		Food fd = kfcObj.serveFood();		
		FeedBack fb = fd.customerResponse();
		}

}

class Company
{
	public static void tagLine()
	{
		System.out.println("TagLine--Good Food For Good Health");
	}
}

class Resturant extends Company
{
	
}

class AirConditioner
{
	
}

class Shirt
{
	Shirt()
	{
		System.out.println("Shirt : Unique dresscode");
	}
}

class Aquirium
{
	Aquirium()
	{
	System.out.println("Aquirium : For decoration");
	}
}

class DisplayScreen
{
	
}

class Toys
{
	
}

final class Kfc extends Resturant
{
	int branchNumber;
	String location;

	AirConditioner acObj = new AirConditioner();
	Shirt dcObj = new Shirt();
	Aquirium aqObj = new Aquirium();
	DisplayScreen dsObj = new DisplayScreen();
	Toys toyObj = new Toys();
	
	
	void account(Branch b)
	{
		System.out.println("Maintains Account in Bank" + b);
	}
	void consumptionBill(GasBill gb)
	{
		System.out.println("Bill for consuming gas" + gb);
	}
	void delivery(TwoWheeler tw)
	{
		System.out.println("Uses two wheeler to deliver food" + tw);
    }
	void payment(Trading td)
	{
		System.out.println("Both online & offline trading/billing acceptable" + td);

	}
	void study(Library lb)
	{
		System.out.println("Chef uses library to study HM" + lb);
	}
	void wrote(Book bk)
	{
		System.out.println("Chef wrote many books" + bk);

	}
	void entertain(Guiter g)
	{
		System.out.println("Guiterist are there to entertain customers" + g);

	}
	void training(ClassRoom cr)
	{
		System.out.println("Classroom training for new chefs" + cr);

	}
	Food serveFood() 
	{
		Food fd = new Food();
		return fd;
	}
	
}

class Branch
{
	
}

class GasBill
{
	
}

class TwoWheeler
{
	
}

class Trading
{
	
}

class Library
{
	
}

class Book
{
	
}
class Guiter
{
	
}
class ClassRoom
{
	
}
class Food
{
	FeedBack customerResponse()
	{
		FeedBack fb = new FeedBack();
		return fb;
	}
}
class FeedBack
{
	
}
