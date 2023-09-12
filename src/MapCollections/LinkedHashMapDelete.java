package MapCollections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDelete {

	public static void main(String[] args) {
		LinkedHashMap<Integer, ProductExp> ip = new LinkedHashMap<Integer, ProductExp>();
		ip.put(180, new ProductExp(18, "King", 1500000));
		ip.put(450, new ProductExp(45, "Hitman", 1500000));
		ip.put(100, new ProductExp(10, "Sachin", 1500000));
		
		
		Set<Entry<Integer, ProductExp>> ss=ip.entrySet();
		Iterator<Entry<Integer, ProductExp>> itr=ss.iterator();
		while(itr.hasNext());
		{
			Entry<Integer, ProductExp> e=itr.next();
			ProductExp p=e.getValue();
			if(p.pid==18)
				itr.remove();
			if(p.pname.equals("Hitman"))
				itr.remove();
			
		}
		
	for(Entry<Integer, ProductExp> e:ip.entrySet())
	{
		ProductExp p=e.getValue();
		System.out.println(p.pid+" "+p.pname+" "+p.pcost);
	}
	

	}

}
