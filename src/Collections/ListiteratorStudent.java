package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListiteratorStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<String>();
		str.add("pathi");
		str.add("Chandu");
		str.add("purna");
		
		ListIterator<String> st = str.listIterator();
		st.add("Krishna");
		
		while(st.hasNext())
		{
			String s=st.next();
			if(s.equals("Chandu"))
				st.remove();
			if(s.equals("purna"))
				st.set("PS");
				
		}
		System.out.println(str);

	}

}
