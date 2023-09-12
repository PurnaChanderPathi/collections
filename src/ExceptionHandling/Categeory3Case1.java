package ExceptionHandling;

import java.util.Scanner;

public class Categeory3Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = scn.nextInt();
		System.out.println(10/num);
		System.out.println("Pathi".charAt(10));
		}catch(ArithmeticException|NumberFormatException a)
		{
			System.out.println(a);
		}
		catch(StringIndexOutOfBoundsException|ClassCastException|NullPointerException s)
		{
			System.out.println(s);
		}
		System.out.println("Rest of the code");
		

	}

}
