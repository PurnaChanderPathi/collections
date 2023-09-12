package ExceptionHandling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(10/0); //java.lang.ArithmeticException: / by zero
		//int[] a = {1,2,3,4};
		//System.out.println(a[7]);//java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 4
		//System.out.println("Purna".charAt(10)); //java.lang.StringIndexOutOfBoundsException: String index out of range: 10
		//String str = null;
		//System.out.println(str.length()); //java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
		//Integer i =new Integer("ten"); //java.lang.NumberFormatException: For input string: "ten"
		//Scanner scn = new Scanner(System.in);
		//System.out.println("Enter the number"); //Exception in thread "main" java.util.InputMismatchException
		//scn.nextInt();
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Pathi");
		Collections.sort(al); //java.lang.ClassCastException:
	}

}
