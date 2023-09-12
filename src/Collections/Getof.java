package Collections;

import java.util.ArrayList;

public class Getof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(new Emp(10, "Pathi"));
		al.add(new Student(11, "Chandu"));
		
		Object o = al.get(1);
		if(o instanceof Emp)
		{
			Emp e =(Emp)o;
			System.out.println(e.Empid+" "+e.Ename);
		}
		if(o instanceof Student)
		{
			Student s =(Student)o;
			System.out.println(s.sid+" "+s.sname);
		}
	}

}
