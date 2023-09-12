package MapCollections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Example1 {

	public static void main(String[] args) {
		TreeMap<ProductExp, Integer> pc = new TreeMap<ProductExp, Integer>(new ReverseExp());
		pc.put(new ProductExp(18, "Virat", 180),18);
		pc.put(new ProductExp(45, "Rohit", 450), 45);
		pc.put(new ProductExp(10, "Sachin", 10), 10);
		pc.put(new ProductExp(07, "Dhoni", 07), 07);
		
		Set<ProductExp> pe=pc.keySet();
		for(ProductExp p:pe)
			System.out.println(p.pid+" "+p.pname+" "+p.pcost);

	}
	
}
class ReverseExp implements Comparator<ProductExp>
{

	@Override
	public int compare(ProductExp p1, ProductExp p2) {
		// TODO Auto-generated method stub
		return -p1.pid.compareTo(p2.pid);
	}
	
}
