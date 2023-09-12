package SetCollections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCustomComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Product> ts = new TreeSet<Product>(new Pro());
		ts.add(new Product(33,"Mobile", 10000));
		ts.add(new Product(12,"earphones", 2000));
		ts.add(new Product(78,"Laptop", 50000));
		
		for(Product p:ts)
		System.out.println(p.id+" "+p.name+" "+p.cost);

	}

}


class Pro implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return -p2.name.compareTo(p1.name);
	}
}
