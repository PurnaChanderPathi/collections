package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemoveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> sl = new ArrayList<String>();
		sl.add("RohitSharma");
		sl.add("SKY");
		sl.add("Samson");
		sl.add("Tilak");
		
		Iterator<String> i=sl.iterator();
		while(i.hasNext())
		{
			String st =i.next();
			if(st.equals("Tilak"))
				i.remove();
			
		}
		System.out.println(sl);

	}

}
