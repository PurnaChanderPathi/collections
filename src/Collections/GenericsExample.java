package Collections;

import java.util.ArrayList;

public class GenericsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(111, "Pathi") );
		al.add(new Emp(222, "Chandu"));
		
		for(Emp e:al)
		{
			System.out.println(e.Empid+" "+e.Ename);
		}
		
		Emp e=al.get(1);
		System.out.println(e.Empid+" "+e.Ename);

	}

}
