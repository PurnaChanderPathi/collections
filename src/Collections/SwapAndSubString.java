package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SwapAndSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al =new ArrayList<String>();
		al.add("pathi");
		al.add("chandu");
		al.add("Purna");
		al.add("Chander");
		
		System.out.println("Before Swapping"+al);
		Collections.swap(al, 1, 2);
		System.out.println("After Swapping"+al);
		
		ArrayList<String> ap = new ArrayList<String>(al.subList(0, 2));
		System.out.println("SubString"+" "+ap);

	}

}
