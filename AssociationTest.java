
public class AssociationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoconutTree cT = new CoconutTree();
		Fertilizer f = new Fertilizer();
		Water w = new Water();
		cT.utilize(f);
		cT.obserb(w);
		Coconut co = cT.ripe();
		Copra cop = co.mature();
		CoconutOil coil = cop.grind();
	
	}

}

class Tree
{

}

class CoconutTree extends Tree
{
	 	float length;
	 	float size;
	 	void utilize(Fertilizer f)
	 	{
	 		System.out.println("uses fertilizers " + f);
	 	}
	 	
	 	void obserb(Water w)
	 	{
	 		System.out.println("uses water " + w);
	 	}
	 	
	 	Coconut ripe()
	 	{
	 		Coconut coco = new Coconut();
	 		return coco;
	 	}
}
class Fertilizer
{
	
}
class Water 
{
	
}
	
class Coconut
{
	Copra mature()
	{
		Copra cop = new Copra();
		return cop;
	}
		
}

class Copra
{
	CoconutOil grind()
	{
		CoconutOil cOil = new CoconutOil();
		return cOil;
	}
}

class CoconutOil
{
	
}

