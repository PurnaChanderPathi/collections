package ExceptionHandling;

import java.util.Scanner;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number");
		try
		{
			int num = scn.nextInt();
			System.out.println(10/num);
			try
			{
				System.out.println("pathi".charAt(10));
			}
			catch(StringIndexOutOfBoundsException s)
			{
				System.out.println(s);
			}
		}
		catch(ArithmeticException q)
		{
			System.out.println(q);
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("Rest of the code");

	}

}
