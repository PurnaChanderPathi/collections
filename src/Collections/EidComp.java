package Collections;

import java.util.Comparator;

public class EidComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp)o1;
		Emp e2 =(Emp)o2;
		if(e2.Empid==e1.Empid)
		return 0;
		else if(e2.Empid>e1.Empid)
			return 1;
		else
			return -1;
			
	}



	

}
