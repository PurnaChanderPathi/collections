package Collections;

import java.util.ArrayList;

public class ContainsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp(10, "Pathi");
		Emp e2 = new Emp(20, "Purna");
		Emp e3 = new Emp(30,"Chandu");
		Emp e4 = new Emp(40, "Chander");
		
		ArrayList<Emp>al = new ArrayList<Emp>();
		al.add(e1);
		al.add(e2);
		
		ArrayList<Emp>ap = new ArrayList<Emp>();
		ap.add(e3);
		ap.add(e4);
		
		
		
		
		ap.addAll(al);
		System.out.println(ap.containsAll(al));
		System.out.println(ap.containsAll(al));
		
//		ap.remove(e1);
//		System.out.println(ap.containsAll(al));
//		System.out.println(ap.containsAll(al));
		
		//ap.remove(al);
		ap.retainAll(al);
		
		for(Emp e :ap) 
		{
		System.out.println(e.Empid+" "+e.Ename);
		}
		
		

	}

}
