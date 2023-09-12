package SetCollections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetSubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=0;i<=10;i++)
		{
			ts.add(i);
			
		}
		System.out.println(ts);
		
		SortedSet<Integer> ts1=ts.subSet(3, 7);
		TreeSet<Integer> ts2 = new TreeSet<Integer>(ts1);
		System.out.println(ts2);
		
		SortedSet<Integer> ts3=ts.tailSet(6);
		TreeSet<Integer> ts4 = new TreeSet<Integer>(ts3);
		System.out.println(ts4);
		
		SortedSet<Integer> ts5=ts.headSet(5);
		TreeSet<Integer> ts6 = new TreeSet<Integer>(ts5);
		System.out.println(ts6);
		
		
				

	}

}
