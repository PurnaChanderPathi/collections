package Collections;

import java.util.ArrayList;

public class OperationsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Pathi");
		al.add(10);
		al.add(null);
		al.add(10.5);
		al.add('P');
		System.out.println(al);
		
		al.add(2, "Chandu");
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		
		al.clear();
		System.out.println(al.isEmpty());

	}

}
