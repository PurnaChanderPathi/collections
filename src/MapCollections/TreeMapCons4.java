package MapCollections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapCons4 {

	public static void main(String[] args) {
		TreeMap<Integer, String> ts = new TreeMap<Integer, String>(new MyComp());
		ts.put(18, "Virat");
		ts.put(45, "Rohit");
		ts.put(07, "Dhoni");
		ts.put(10, "Sachin");
		System.out.println(ts);
		

	}

}

class MyComp implements Comparator<Integer>
{


	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return -i1.compareTo(i2);
	}
}
	

