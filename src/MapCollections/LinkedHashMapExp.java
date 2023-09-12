package MapCollections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;

public class LinkedHashMapExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Emp,Student > es = new LinkedHashMap<Emp, Student>();
		es.put(new Emp(111, "virat"), new Student(222, "Rohit"));
		es.put(new Emp(333, "SKY"), new Student(444, "Tilak"));
		
		Set<Emp> s=es.keySet();
		for(Emp e:s)
		{
			//System.out.println(e.empId+" "+e.empName);
		}
		
		Collection<Student> st=es.values();
		for(Student st1:st)
		{
			//System.out.println(st1.sid+" "+st1.sname);
		}
		
		Set<Entry<Emp, Student>> p=es.entrySet();
		Iterator<Entry<Emp, Student>> pp=p.iterator();
		while(pp.hasNext())
		{
			 Entry<Emp, Student> pc=pp.next();
			 Emp pc1=pc.getKey();
			 System.out.println(pc1.empId+" "+pc1.empName);
			 
			 Student stu=pc.getValue();
			 System.out.println(stu.sid+" "+stu.sname);
		}

	}

}
