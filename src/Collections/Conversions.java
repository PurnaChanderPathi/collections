package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// conversion for generic Arrays to collection
		String [] s = {"pathi","purna","Chander"};
		ArrayList<String> as = new ArrayList<String>(Arrays.asList(s));
		as.add("Eidiko");
		System.out.println(as);
		
		//conversion of generic collection to Arrays
		ArrayList<String> str = new ArrayList<String>();
		str.add("Eidiko");
		str.add("java");
		String[] st =new String[str.size()]; 
		str.toArray(st);
		
		for(Object ss:st)
		{
		
		System.out.println(ss);
		}
		
		//conversion of normal Collection to Array
		ArrayList al = new ArrayList();
		al.add("eiidko");
		al.add(10);
		
		Object[] o=al.toArray();
		for(Object oo:o)
		{
			System.out.println(oo);
		}
	
		
		
		

	}

}
