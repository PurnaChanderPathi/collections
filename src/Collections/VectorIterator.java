package Collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer>v = new Vector<Integer>();
		for(int i=1; i<=30; i++)
		{
		v.add(i);
		
		}
		System.out.println(v);
		
	// remove the old elements by using iterator cursor
		Iterator<Integer> it=v.iterator();
		while(it.hasNext())
		{
			Integer h=it.next();
					if(h%2==0)
					{
						System.out.println(h);
					}
					else
					{
						it.remove();
					}
				
		}
		System.out.println(v);
		

	}

}
