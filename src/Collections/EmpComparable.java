package Collections;

public class EmpComparable implements Comparable {
	int id;
	String name;
	public EmpComparable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		EmpComparable Emp = (EmpComparable)o;
		if(id==Emp.id)
		{
		return 0;
		}
		else if(id>Emp.id)
		{
			return 1;
		}
		else
			return -1;
	}
	

}
