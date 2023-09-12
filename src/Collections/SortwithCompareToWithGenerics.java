package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortwithCompareToWithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<EmpComparableWithGenerics> emp = new ArrayList<EmpComparableWithGenerics>();
		emp.add(new EmpComparableWithGenerics(18, "virat"));
		emp.add(new EmpComparableWithGenerics(46, "Rohit"));
		emp.add(new EmpComparableWithGenerics(10, "Sachin"));
		
		Collections.sort(emp);
		
		for(EmpComparableWithGenerics scw:emp)
		{
			System.out.println(scw.id+" "+scw.name);
		}
		

	}

}
