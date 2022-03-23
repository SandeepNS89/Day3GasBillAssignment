
public class GasBillProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Gas Bill Project");
		GasBill gB = new GasBill();
		gB.setGasBill(101, "Rajesh", "Nai Mumbai",784225562,8);
	   // System.out.println("Cunsumer Details  "+ gB);
		gB.showBill();
		
		DomesticGasBill dGB = new DomesticGasBill("domestic");
		System.out.println("Cunsumer Type : "+ dGB);
		dGB.domesticUnitPrice();
		
		CommercialGasBill cGB = new CommercialGasBill();
		cGB.setCommercialType("commercial");
		System.out.println("Cunsumer Type : "+ cGB);
		
		
		IndustrialGasBill iGB = new IndustrialGasBill();
		iGB.industrialPrice();

	}

}

class GasBill
{
	long consId;
	String cunsumerName;
	String address;
	long mobileNumber;
	int unitUsed;
	String type;
	String subType;
	
	GasBill()
	{
		
	}
	
	public void setGasBill(long consId, String cunsumerName, String address, long mobileNumber, int unitUsed) {
		
		this.consId = consId;
		this.cunsumerName = cunsumerName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.unitUsed = unitUsed;
	}

	// @Override
//	public String toString() {
//		return "GasBill [billId=" + billId + ", cunsumerName=" + cunsumerName + ", address=" + address + ", unitUsed="
//				+ unitUsed + "]";
	
	void showBill()
	{
		System.out.println("---------------------------");
		System.out.println("Cunsumer Details");
		System.out.println("---------------------------");
		System.out.println("Consumer ID     :" + consId);
		System.out.println("Consumer Name   :" + cunsumerName);
		System.out.println("Address         :" + address);
		System.out.println("Contact Number  :" + mobileNumber);
		System.out.println("UnitUsed        :" + unitUsed);
	}	
}

class DomesticGasBill extends GasBill
{
 	public DomesticGasBill(String type)
	{
		super();
		this.type = type;
	}

	@Override
	public String toString()
	{
		System.out.println("---------------------------");
		return "DomesticGasBill [type=" + type + "]";
	}	
	
	void domesticUnitPrice()
	{
		System.out.println("Domestic price of Gas per unit is Rs.13");
	}
 	
}

class CommercialGasBill extends GasBill
{
	
	void  setCommercialType(String type)
	 {
		this.type = type;
	}

	@Override
	public String toString()
	{
		
		return "CommercialGasBill [type=" + type + "]";
	}	
	
	CommercialGasBill()
	{
		System.out.println("---------------------------");
		System.out.println("Commercial price of Gas per unit varies on sub-type");
	}

}

class IndustrialGasBill extends CommercialGasBill
{
	
	void industrialPrice()
	{
		
		System.out.println("Industrial price of Gas per unit is Rs.22");

	}
}