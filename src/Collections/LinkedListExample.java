package Collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("pathi");
		ll.add("purna");
		ll.add("Chander");
		
		System.out.println(ll);// pathi purna chander
		
		ll.addFirst("eidiko");
		ll.addLast("java");
		System.out.println(ll); //eidiko pathi purna chander java
		System.out.println(ll.size()); //5
		
		ll.add(4, "Patel"); 
		ll.set(5, "IBM");
		System.out.println(ll); //eidiko pathi purna chander patel IBM
		
		System.out.println(ll.isEmpty()); //false
		ll.clear();
		System.out.println(ll.isEmpty());//true

	}

}
