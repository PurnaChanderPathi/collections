package SetCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();  //insertion order not preserved
		hs.add("Pathi");
		hs.add("Purna");
		hs.add("Chander");
		hs.add("Pathi"); // duplicates will ignore 
		System.out.println(hs); // duplicates will ignore 
		
		HashSet<String> hs1 = new HashSet<String>(); //insertion order not preserved
		System.out.println(hs1.add("Pathi"));
		System.out.println(hs1.add("Pathi")); // duplicates will ignore 
		System.out.println(hs1); 
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(); //insertion order preserved
		lhs.add("pathi");
		lhs.add("purna");
		lhs.add("Chander");
		System.out.println(lhs);
		

	}

}
