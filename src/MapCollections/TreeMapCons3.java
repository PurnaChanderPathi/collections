package MapCollections;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class TreeMapCons3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> is = new TreeMap<Integer, String>();
		is.put(18, "Virat");
		is.put(07, "Dhoni");
		is.put(45,"Dhoni");
		
		SortedMap<Integer, String> ss=is.subMap(15, 50);
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(ss);
		System.out.println(tm);
		
		SortedMap<Integer, String> ss1 = is.tailMap(20);
		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>(ss1);
		System.out.println(tm1);
		
		SortedMap<Integer, String> ss2=is.headMap(19);
		TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>(ss2);
		System.out.println(tm2);
		
	}

}
