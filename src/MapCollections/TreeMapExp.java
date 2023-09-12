package MapCollections;

import java.util.TreeMap;

public class TreeMapExp {

	public static void main(String[] args) {

		TreeMap<Integer, String> is = new TreeMap<Integer, String>();
		is.put(18, "Virat");
		is.put(45, "Rohit");
		is.put(07, "Dhoni");
		System.out.println(is);
		
		TreeMap<String, Integer> si = new TreeMap<String, Integer>();
		si.put("Virat",18);
		si.put("Rohit",45);
		si.put("Dhoni",07);
		System.out.println(si);

	}

}
