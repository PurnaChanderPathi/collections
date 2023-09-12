package Collections;

import java.util.ArrayList;

public class AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add(10);
		
		//calling one cons into another cons
		ArrayList a1 = new ArrayList(a);
		a1.add(20);
		
		System.out.println(a1);
		
		ArrayList b = new ArrayList();
		b.add(30);
		
		ArrayList b1 = new ArrayList();
		b1.add(40);
		
		ArrayList b2 = new ArrayList();
		b2.add(50);
		b2.addAll(b1);
		b2.addAll(b);
		
		System.out.println(b2);
		
		

	}

}
