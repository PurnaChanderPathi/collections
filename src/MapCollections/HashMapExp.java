package MapCollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;



public class HashMapExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> is = new HashMap<Integer, String>();
		is.put(18, "Virat");
		is.put(45, "Rohit");
		is.put(07, "MSD");
		
		System.out.println(is);
		
		Set<Integer> s=is.keySet();
		System.out.println(s);

		
		Collection<String> v=is.values();
		System.out.println(v);
		
		Set<Entry<Integer, String>> e=is.entrySet();
		for(Entry<Integer, String>e1:e)
		{
			System.out.println(e1.getValue()+" "+e1.getKey());
		}
	}

}
