package ExceptionHandling;

import java.util.Scanner;

public class throwExp2 {
	static void Status(int age) throws  InvalidAgeExceptionparam
	{
		if(age > 20)
		{
			System.out.println("Eligible for mrg");
		}
		else
		{
			throw new InvalidAgeExceptionparam("You are not eligible for marrage");
		}
	}

	public static void main(String[] args) throws  InvalidAgeExceptionparam {
		// TODO Auto-generated method 0
		// TODO Auto-generated method stub 
				Scanner scn = new Scanner(System.in);
				System.out.println("Enter age");
				int age = scn.nextInt();
			
				throwExp2.Status(age);


	}

}
