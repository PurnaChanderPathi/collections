package SetCollections;

import java.util.ArrayList;

public class ArrayListCloneExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> as = new ArrayList<String>();
		as.add("Pathi");
		as.add("Purna");
		as.add("Chander");
		System.out.println(as);
		
		ArrayList<String> copy=(ArrayList<String>)as.clone();
		System.out.println(copy);

	}

}
