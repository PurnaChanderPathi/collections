package Collections;

import java.util.ArrayList;

public class EmployeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(new Emp(10, "Pathi"));
		al.add(new Student(12, "Purna")); // hashcode is printed
		al.add(10);
		al.add("eidiko");
		System.out.println(al);
		// to overcome hash code below implemention done
		
		for(Object o :al)
		{
			if(o instanceof Emp)
			{
				Emp e = (Emp)o;
				System.out.println(e.Empid+""+e.Ename);
			}
			if(o instanceof Student)
			{
				Student s = (Student)o;
				System.out.println(s.sid+""+s.sname);
			}
			if(o instanceof Integer)
			{
				System.out.println(o);
			}
			if(o instanceof String)
			{
				System.out.println(o);
			}
		}

	}

}
