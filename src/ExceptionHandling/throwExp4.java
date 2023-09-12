package ExceptionHandling;

import java.util.Scanner;

public class throwExp4 {
	static void Status(int age) 
	{
		if(age > 20)
		{
			System.out.println("Eligible for mrg");
		}
		else
		{
			throw new InvalidAgeRunTimeExceptionParam("You are not eligible for mrg");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter age");
		int age = scn.nextInt();
	
		throwExp4.Status(age);

	}

}
