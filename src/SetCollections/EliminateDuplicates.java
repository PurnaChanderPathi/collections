package SetCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EliminateDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s = new HashSet<String>(); // Parent p = new Child();
		s.add("Pathi");
		s.add("Purna");
		s.add("Chander");
		System.out.println(s);
		
		ArrayList<String> as = new ArrayList<String>();
		as.add("Virat");
		as.add("Kohli");
		as.add("Virat");
		as.add("Kohli");
		
		
		HashSet<String> hs = new HashSet<String>(as); // Elimination Duplicates
		System.out.println(hs);
		

	}

}
