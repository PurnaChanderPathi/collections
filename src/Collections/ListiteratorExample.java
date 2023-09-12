package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListiteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("KIng");
		al.add("Virat");
		al.add("Kohli");
		
//		// reading the data  by using normal ListIterator
		
//		ListIterator l=al.listIterator();
//		while(l.hasNext())
//		{
//			String s=(String)l.next();
//			System.out.println(s);
//		}
//		
//		while(l.hasPrevious())
//		{
//			String s1 = (String)l.previous();
//			System.out.println(s1);
//		}
		
		//reading the data  by using Generic ListIterator
		ListIterator<String> str=al.listIterator();
		while(str.hasNext())
		{
			String s2=str.next();
			System.out.println(s2);
		}
		
		while(str.hasPrevious())
		{
			String s3=str.previous();
			System.out.println(s3);
		}
		

	}

}
