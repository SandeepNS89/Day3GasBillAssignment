
public class TestPassingObjectNReturningObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person personObj1 = new Person("Ravi",23,"M");
		Person personObj2 = new Person("Ramya",25,"F");
		Person personObj3 = new Person("Raja",35,"M");
		Person personObj4 = new Person("Rama",25,"F");
		
		Train trainObj = new Train();
		Destination dest = trainObj.travel(personObj3, personObj4, "Sangli","Maharastra","India",460033);
        System.out.println(dest);
        System.out.println("---------------------------------------------------------------------------");
        Train trainObj1 = new Train();
        Destination dest1 = trainObj1.travel(personObj1, personObj2, "Bengaluru", "Karnataka", "India", 560019);
        System.out.println(dest1);

	}

}

class Destination 
{
	String city;
	String state;
	String country;
	int pin;
	
	public Destination(String city, String state, String country, int pin) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the pin
	 */
	public int getPin() {
		return pin;
	}

	/**
	 * @param pin the pin to set
	 */
	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "city=" + city +", state=" + state + ", country=" + country + ", pin=" + pin + "";
	}
	
	
}

class Train
{
	Destination travel(Person x, Person y)
	{
		System.out.println(x.getName() + " Travels with " + y.getName());
		Destination dest = new Destination("Mangalore","Karnataka","India",560033);
		return dest;
	}
	
	Destination travel(Person x, Person y, String ct, String st, String con, int pin)
	{
		System.out.println(x.getName() + " Travels with " + y.getName());
		Destination dest = new Destination(ct,st,con,pin);
		return dest;
	}
}

class Person
{
	private String name;
	private int age;
	private String gender;
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
}