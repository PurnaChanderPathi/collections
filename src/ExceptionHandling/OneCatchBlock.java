package ExceptionHandling;

import java.util.Scanner;

public class OneCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = scn.nextInt();
			System.out.println(10/num); //ArithemeticException
			System.out.println("Pathi".charAt(10));//IndexOutOfBoundsException
		}
		catch(Exception a)
		{
			System.out.println(a);
		}
	

	}

}
