package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ProductVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Product> p = new Vector<Product>();
		p.add(new Product(01, "Fz", 150000));
		p.add(new Product(01, "Pulsar", 140000));
		p.add(new Product(03, "Duke", 210000));
		
		//Print data by using Enumeration
		
//		Enumeration<Product> en=p.elements();
//		while(en.hasMoreElements())
//		{
//			Product pp=en.nextElement();
//			System.out.println(pp.id+" "+pp.name+" "+pp.cost);
//		}
//		
		//Print data by using Iterator
		
//		Iterator<Product> Product = p.iterator();
//		while(Product.hasNext())
//		{
//			Product pt=Product.next();
//			System.out.println(pt.id+" "+pt.name+" "+pt.cost);
//		}
		
		////Print data by using ListIterator
		
		ListIterator<Product> Pro = p.listIterator();
		while(Pro.hasNext())
		{
			Product ptt=Pro.next();
			System.out.println(ptt.id+" "+ptt.name+" "+ptt.cost);
		}
		
				
	
	}

}
