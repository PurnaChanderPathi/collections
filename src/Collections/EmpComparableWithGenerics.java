package Collections;

public class EmpComparableWithGenerics implements Comparable<EmpComparableWithGenerics> {
	int id;
	String name;
	public EmpComparableWithGenerics(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(EmpComparableWithGenerics o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	

}
