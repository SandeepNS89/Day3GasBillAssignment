//import javax.swing.border.LineBorder;

public class AssociationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kfc kfcObj = new Kfc("Hygine");
		kfcObj.maintain();
		//System.out.println(kfcObj);
		Branch br = new Branch();
		kfcObj.billPayment(br);
		kfcObj.consumptionBill(br);
		
//		Trading td = new Trading();
//		kfcObj.payment(td);
		
		TwoWheeler tw = new TwoWheeler();
		kfcObj.delivery(tw);
		
//		GasBill gb = new GasBill();
//		kfcObj.consumptionBill(gb);
		
		Library lib = new Library();
		kfcObj.libraryContains(lib);
		
		ClassRoom cs = new ClassRoom();
		Kfc.entertainCustumer(cs);
		
		ClassRoom cr = new ClassRoom();
		kfcObj.training(cr);
	
		
		Food fd = kfcObj.serveFood();		
		FeedBack fb = fd.customerResponse();
		}

}

class Company
{
	Company()
	{
		System.out.println("------constructor ----------------");
		System.out.println("TagLine--Good Food For Good Health");
		System.out.println("----------------------------------");
		
	}
}

abstract class Resturant extends Company
{
	abstract void maintain();
	Resturant(String hy)
	{
		System.out.println("----constructor with arguments -----");
		System.out.println("This is Resturant is Hegenic : " + hy);
		
	}
}

  class AirConditioner
{
	//void facility(;)
}

class Shirt
{
	Shirt()
	{
		//System.out.println("Shirt : Unique dresscode");
	}
}

class Aquirium
{
	Aquirium()
	{
	//System.out.println("Aquirium : For decoration");
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
	Kfc(String hy) {
		super(hy);
		// TODO Auto-generated constructor stub
		System.out.println("-----super ctor-------");
		System.out.println("-------------------------------------");
	}
	int branchNumber;
	String location;

	AirConditioner acObj = new AirConditioner();
	Shirt dcObj = new Shirt();
	Aquirium aqObj = new Aquirium();
	DisplayScreen dsObj = new DisplayScreen();
	Toys toyObj = new Toys();
	

	void maintain()
	{
		System.out.println("------Abstruct Class-----");
		System.out.println("Well maintained");
		System.out.println("-----------------------------");
	}
	
	
	void delivery(TwoWheeler tw)
	{
		//System.out.println("Uses two wheeler to deliver food" + tw);
    }
	

	void libraryContains(Book bk)
	{
		System.out.println("--- Default Interface and Object Slice---------");
		System.out.println("Library has many books");
		bk.compitativeBook();
		bk.storyBook();
		bk.novelBook();
		System.out.println("-----------------------------");
	}
	static void entertainCustumer(Guiter g)
	{
		System.out.println("-----Static,Interface and Object Slice-------");
		System.out.println("Guiterist are there to entertain customers");
		g.guiterBasicsTraining();
		g.guitorInterTraining();
		g.guitorAdvanceTraining();
		System.out.println("-----------------------------");
	}
	
	protected void billPayment(Trading td)
	{
		System.out.println("---Protected,MultipleInterface and ObjectSlice-------");
		System.out.println("Bill payments");
		td.onlineBill();
		td.offlineBill();
		System.out.println("-----------------------------");	
	}
	public void consumptionBill(GasBill gb)
	{
		System.out.println("---Public,MultipleInterface and ObjectSlice-------");
		System.out.println("Bill for consuming gas");
		gb.gasBilldue();
		System.out.println("-----------------------------");
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


interface GasBill
{
	void gasBilldue();
}

class TwoWheeler
{
	
}

interface Trading
{
	void onlineBill();
	void offlineBill();
}
class Branch implements Trading,GasBill
{

	@Override
	public void onlineBill() {
		// TODO Auto-generated method stub
		System.out.println("you pay bill through online mode");
	}

	@Override
	public void offlineBill() {
		// TODO Auto-generated method stub
		System.out.println("you pay bill through offline mode");
	}

	@Override
	public void gasBilldue() {
		// TODO Auto-generated method stub
		System.out.println("pay your gas bill");
	}
	
}

interface Book
{
	void chefBook();
	void storyBook();
	void compitativeBook();
	void novelBook();
	//void guitorLearningBook();
	
}

class Library implements Book
{
	@Override
	public void storyBook() {
		// TODO Auto-generated method stub
		System.out.println("Library has many story books");
	}

	@Override
	public void compitativeBook() {
		// TODO Auto-generated method stub
		System.out.println("Library has many compitative books");
	}

	@Override
	public void novelBook() {
		// TODO Auto-generated method stub
		System.out.println("Library has many novel books");
	}

	@Override
	public void chefBook() {
		// TODO Auto-generated method stub
		System.out.println("Library has many chef books");
	}
	
}


interface Guiter
{
	void guiterBasicsTraining();
	void guitorInterTraining();
	void guitorAdvanceTraining();
}
class ClassRoom implements Guiter
{
	@Override
	public void guiterBasicsTraining() {
		// TODO Auto-generated method stub
		System.out.println("Classroom has many guitor basic training classes");

	}

	@Override
	public void guitorInterTraining() {
		// TODO Auto-generated method stub
		System.out.println("Classroom has many guitor intermidiate training classes");

	}

	@Override
	public void guitorAdvanceTraining() {
		// TODO Auto-generated method stub
		System.out.println("Classroom has many guitor advance training classes");

	}
	
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
