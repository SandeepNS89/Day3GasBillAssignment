
public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Loop begins");
		House1 h1 = new House1(102, "Mathru Nilaya", "Bengaluru", "abcd");
		House1 h2 = new House1(112, "Sai Nilaya", "Navi Mumbai", "efgh");
		Owner o1 = new Owner();
		Owner o2 = new Owner();
		HouseKey hk1 = new HouseKey("abcd");
		HouseKey hk2 = new HouseKey("efgh");
		
		Thread td1 = new Thread(h1);
		td1.start();
		Thread td2 = new Thread(h2);
		td2.start();
		
		try
		{
			o1.openTheDoor(h1,hk1);
		}
		catch (LockException e) {
			// TODO: handle exception
			System.out.println("Lock Problem "+e);
		}
		catch (UnlockException e) {
			// TODO: handle exception
			System.out.println("Unlock Problem "+e);
		}
		System.out.println("House Details "+h1);
		System.out.println("Main Loop ends");

	}

}
//Interface
interface Person2
{
	void openTheDoor(Building1 bd,Key k) throws LockException,UnlockException;
	void takeFood();
}

class Owner implements Person2
{
	String name;
	@Override
	public void takeFood() {
		// TODO Auto-generated method stub
		System.out.println("Consumes food");
	}
	@Override
	public void openTheDoor(Building1 bd, Key k) throws LockException,UnlockException  //Passing Object Parameter & Exception handling
	 {
		// TODO Auto-generated method stub
		House1 home =(House1) bd;
		if(home.dr.password.equals(k.password))
		{
			home.dr.unlockHouse();
		}
		else
		{
			throw new UnlockException("unable to lock");
		}
		k.unlockPwd();
		if(home.dr.password.equals(k.password))
		{
			home.dr.lockHouse();
		}
		else
		{
			throw new LockException("unable to unlock");
		}
	}
}

//Customised Exceptions
class UnlockException extends Exception
{
	UnlockException(String str)
	{
	super(str);
	}
}
class LockException extends Exception
{
	LockException(String str)
	{
	super(str);
	}
}

//abstract class, Inheritance
abstract class Key
{
	String password;
	abstract void unlockPwd();
	abstract void lockPwd();
}
class HouseKey extends Key
{
	protected HouseKey(String password)   //Protected Access Specifier
	{
		super();
		this.password = password;
	}
	@Override
	void unlockPwd() {                      //Default Access Specifier
		// TODO Auto-generated method stub
		System.out.println("pwd is unlocked");
	}

	@Override
	void lockPwd() {
		// TODO Auto-generated method stub
		System.out.println("pwd is locked");
	}
}
abstract class Lock
{
	String password;
	abstract void unlockHouse();
	abstract void lockHouse();
}
class DoorLock extends Lock
{
    public DoorLock(String password)
	{
		super();
		this.password = password;
	}
	@Override
	void unlockHouse() {
		// TODO Auto-generated method stub
		System.out.println("Door is unlocked");
	}

	@Override
	void lockHouse() {
		// TODO Auto-generated method stub
		System.out.println("Door is locked");
	}
	
}

class Parking
{
	
}
class CarParking extends Parking   //IsA 
{
	void parkingAvailable()
	{
		System.out.println("u can park the car");
	}
}
class Building1 
{
	
}
class House1 extends Building1 implements Runnable //MultiThreading
{
	int houseNumber;
	String houseName;
	String address;
	Lock dr;
    Parking p = new CarParking(); //HasA
   
	public House1(int houseNumber, String houseName, String address,String pwd) {
		super();                           // super class Constructor
		this.houseNumber = houseNumber;
		this.houseName = houseName;
		this.address = address;
		 dr = new DoorLock(pwd);
	}
	@Override
	public String toString() {                                  //ToString Overriding'+'
		return "House [houseNumber=" + houseNumber + ", houseName=" + houseName + ", address=" + address + "]";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Testing MultiThread");
		for(int i=1;i<=100;i++)
		{
			System.out.println(houseName+"Testing "+i);
		}
	}
	
}