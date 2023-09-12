package SetCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Emp> lhs = new LinkedHashSet<Emp>();
		lhs.add(new Emp(18, "Virat"));
		lhs.add(new Emp(45, "Rohit"));
		lhs.add(new Emp(10, "Sachin"));
		
	 Iterator<Emp> emp=lhs.iterator();
	 while(emp.hasNext())
	 {
		 Emp emp1= emp.next();
		
		 if(emp1.eid==45)
			 emp.remove();
		 if(emp1.ename.equals("Sachin"))
			 emp.remove();
		
	 }
	 for(Emp ll:lhs)
	 {
		 System.out.println(ll.eid+" "+ll.ename);
	 }

	}

}
