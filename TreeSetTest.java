import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChemicalElement ce = new ChemicalElement("Nitrogen", 7, "N2", 14);
		TreeSet<ChemicalElement> lab = new TreeSet<ChemicalElement>();
		
		lab.add(new ChemicalElement("Hydrogen", 1 ,"H", 2));
		lab.add(new ChemicalElement("Helium", 2 ,"He", 4));
		lab.add(new ChemicalElement("Oxygen", 8 ,"O2", 16));
		lab.add(new ChemicalElement("Carbon", 6 ,"C", 12));
		lab.add(new ChemicalElement("Carb", 6 ,"C", 12));
		lab.add(ce);
		
		Iterator<ChemicalElement> itr =lab.iterator();
		while(itr.hasNext())
		{
			ChemicalElement ce1 = itr.next();
			System.out.println("Chemical Elements "+ce1);
		}

	}

}

class ChemicalElement implements Comparable<ChemicalElement>
{
	String atomicName;
	int atomicNumber;
	String atomicFormula;
	int atomicWeight;
	public ChemicalElement(String atomicName, int atomicNumber, String atomicFormula, int atomicWeight) {
		super();
		this.atomicName = atomicName;
		this.atomicNumber = atomicNumber;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicName=" + atomicName + ", atomicNumber=" + atomicNumber + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}
	@Override
	public int compareTo(ChemicalElement o) {
		// TODO Auto-generated method stub
		
		System.out.println("Comparing "+ atomicNumber + " with "+o.atomicNumber);
		return Integer.compare(atomicNumber, o.atomicNumber);
	}
	
}
