package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Books> Book = new ArrayList<Books>();
		Book.add(new Books(18, "King", "Kohli"));
		Book.add(new Books(10, "GodofCricket", "Sachin"));
		Book.add(new Books(7, "CaptainCool", "MsDhoni"));
		
		Iterator<Books> b=Book.iterator();
		while(b.hasNext())
		{
			Books o=b.next();
			if(o.id==10)
				b.remove();
			if(o.id==7)
				b.remove();
		
			
			
		}
		for(Books bb:Book)
		{
		System.out.println(bb.id+" "+bb.Name);
		}

	}

}
