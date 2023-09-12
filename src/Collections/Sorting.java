package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<String>();
		str.add("Purna");
		str.add("Ramesh");
		str.add("Kalyan");
		System.out.println("Before Sorting"+" "+str);
		Collections.sort(str);
		System.out.println("After Sorting"+" "+str);
		
		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(700);
		lst.add(100);
		lst.add(500);
		System.out.println("Before Sorting"+" "+lst);
		Collections.sort(lst);
		System.out.println("After Sorting"+" "+lst);
		

	}

}
