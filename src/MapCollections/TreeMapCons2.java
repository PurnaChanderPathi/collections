package MapCollections;

import java.util.TreeMap;

public class TreeMapCons2 {

	public static void main(String[] args) {
		
		//Constructor Approach
		TreeMap<Integer, String> is = new TreeMap<Integer, String>();
		is.put(18, "Virat");
		
		TreeMap<Integer, String> is1 = new TreeMap<Integer, String>(is);
		is1.put(45, "Rohit");
		System.out.println(is1);
		
		//PutAll Approach
		TreeMap<Integer, String> is2 = new TreeMap<Integer, String>();
		is2.put(18, "Virat");
		
		TreeMap<Integer, String> is3 = new TreeMap<Integer, String>();
		is3.put(45, "Rohit");
		
		TreeMap<Integer, String> is4 = new TreeMap<Integer, String>();
		is4.put(10, "Sachin");
		is4.putAll(is2);
		is4.putAll(is3);
		
		
		System.out.println(is4);
		
		

	}

}
