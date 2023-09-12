package SetCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ConsCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Pathi");
		
		HashSet lhs1 = new HashSet(lhs); // calling one Cons
		lhs1.add("Purna");
		lhs1.add("Chander");
		System.out.println(lhs1);
		
		LinkedHashSet h1 = new LinkedHashSet();
		h1.add("Pathi");
		
		LinkedHashSet h2 = new LinkedHashSet();
		h2.add("Purna");
		
		LinkedHashSet h3 = new LinkedHashSet();
		h3.addAll(h1); // calling multiple Cons
		h3.addAll(h2); // calling multiple Cons
		h3.add("Chander");
		
		System.out.println(h3);
		
		
		
		
		

	}

}
