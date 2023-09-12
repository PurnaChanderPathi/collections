package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<String>();
		str.add("Pathi");
		str.add("Purna");
		str.add("Chander");
		
		// reading the data  by using normal iterator
		Iterator itr=str.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.println(s);
		}
		
		//reading the data  by using Generic Iterator
		Iterator<String> itr1=str.iterator();
		while(itr1.hasNext())
		{
			String s1=itr1.next();
			System.out.println(s1);
		}

	}

}
