package Collections;

public class ProductComparable implements Comparable {
	int id;
	String name;
	int cost;
	public ProductComparable(int id, String name, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		ProductComparable e1 = (ProductComparable)o;
		if(id==e1.id)
		
			return 0;
		
		else if(id>e1.id)
			return 1;
		else
			return -1;
			
	}


}
