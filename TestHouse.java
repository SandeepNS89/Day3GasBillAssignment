
public class TestHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    House H = new House();
    H.nameOfHouse();
    float area = H.areaOfHouse(30, 40);
    System.out.println(area);
    H.numberOfRooms(4);
	String park = H.isCarParking();	
	System.out.println(park);
	}
	
}

class House
{
	    String houseName = "Dream Home";
	    String val;
		public void nameOfHouse()
		{
			System.out.println("My house name is "+ houseName);
		}
		
		public float areaOfHouse(float a, float b)
		{
			System.out.println("Area of house");
			float area = a*b;
			return area;
		}
		
		public void numberOfRooms(int x)
		{
			System.out.println("Number of rooms are "+x);
		}
		
		public String isCarParking()
		{
			System.out.println("Car parking");
			return val = "yes";
		}
}
