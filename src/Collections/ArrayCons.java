package Collections;

import java.util.ArrayList;

public class ArrayCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
		a2.add(40);
		a2.add(50);
		System.out.println(a2);

	}

}
