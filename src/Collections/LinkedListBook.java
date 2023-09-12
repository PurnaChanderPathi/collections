package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

import Declaration.book;

public class LinkedListBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Books> ll = new LinkedList<Books>();
		ll.add(new Books(10, "Chethan", "HalfGirlfriend"));
		ll.add(new Books(11, "SSR", "RRR"));
		ll.add(new Books(12, "PrashanthNeel", "KGF"));
		
		ListIterator<Books> b=ll.listIterator();
		b.add(new Books(13, "Nag", "kalki"));
		while(b.hasNext())
		{
			Books book=b.next();
			if(book.Author.equals("Chethan"))
				b.remove();
			
		}
		for(Books bb:ll)
		{
		System.out.println(bb.id+" "+bb.Author+" "+bb.Name);
		}

			
		

	}

}
