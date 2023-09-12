package ExceptionHandling;

import java.util.Scanner;

public class throwExp3 {
	static void Status(int age) 
	{
		if(age > 20)
		{
			System.out.println("Eligible for mrg");
		}
		else
		{
			throw new InvalidAgeRuntimeException();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter age");
		int age = scn.nextInt();
	
		throwExp3.Status(age);


	}

}
