package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorEmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> emp = new ArrayList<Emp>();
		emp.add(new Emp(3, "Purna"));
		emp.add(new Emp(22, "Ajeeth"));
		emp.add(new Emp(8, "Shiva"));
		
		Collections.sort(emp, new EnameComp()); 
		
		for(Emp e:emp)
		{
			System.out.println(e.Empid+" "+e.Ename);
		}
		

	}

}
