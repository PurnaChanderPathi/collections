package ExceptionHandling;

import java.util.Scanner;

public class throwExp1 {
 static void Status(int age) throws InvalidAgeException
	{
		if(age > 20)
		{
			System.out.println("Eligible for mrg");
		}
		else
		{
			throw new InvalidAgeException();
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub 
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter age");
		int age = scn.nextInt();
	
		throwExp1.Status(age);
		

	}

}
