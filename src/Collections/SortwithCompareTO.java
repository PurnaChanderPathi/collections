package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortwithCompareTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<EmpComparable> Emp = new ArrayList<EmpComparable>();
		Emp.add(new EmpComparable(2, "Virat"));
		Emp.add(new EmpComparable(3, "Rohit"));
		Emp.add(new EmpComparable(1, "SKY"));
		
		Collections.sort(Emp);
		
		for(EmpComparable ee:Emp)
		{
			System.out.println(ee.id+" "+ee.name);
		}
		
		

	}

}
