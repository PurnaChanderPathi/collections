package Collections;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("Purna");
		v.add("Ajeeth");
		v.add("Shiva");
		
		// reading the data  by using normal enumeration
					Enumeration g = v.elements();
					while(g.hasMoreElements())
					{
						String s1= (String) g.nextElement();
						System.out.println(s1);
					}
		
		 //reading the data  by using Generic enumeration
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements())
		{
			String s =e.nextElement();
			System.out.println(s);
			
			
			
		}

	}

}
