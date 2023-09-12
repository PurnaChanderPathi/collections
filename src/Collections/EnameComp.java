package Collections;

import java.util.Comparator;

public class EnameComp implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;
        return e2.Ename.compareTo(e1.Ename);
	}

}
