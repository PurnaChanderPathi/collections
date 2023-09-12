package SetCollections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>(new CompString());
		ts.add("Pathi");
		ts.add("ajeeth");
		ts.add("Shiva");
		System.out.println(ts);
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>(new CompInteger());
		ts1.add(18);
		ts1.add(45);
		ts1.add(10);
		System.out.println(ts1);
		
		

	}

}

class CompString implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.compareTo(s2);
	}
	
}
class CompInteger implements Comparator<Integer>
{

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return i2.compareTo(i1);
	}
	
}
