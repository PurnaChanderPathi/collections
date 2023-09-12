package Collections;

import java.util.Collections;
import java.util.LinkedList;

public class CompartableLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<ProductComparable> ll = new LinkedList<ProductComparable>();
		ll.add(new ProductComparable(18, "Virat", 1000));
		ll.add(new ProductComparable(7, "Dhoni", 900));
		ll.add(new ProductComparable(11, "Rohit", 600));
		ll.add(new ProductComparable(11, "SKY", 200));
		
		Collections.sort(ll);
		
		for(ProductComparable p :ll)
		{
			System.out.println(p.id+" "+p.name+" "+p.cost);
		}
		
		

	}

}
