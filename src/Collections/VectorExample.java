package Collections;

import java.util.*;


public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Vector<String> v = new Vector<String>(2,4);
	System.out.println(v.capacity());
	v.add("virat");
	v.add("Rohit");
	v.add("Dhoni");
	System.out.println(v.capacity());

	}

}
