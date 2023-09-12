package ExceptionHandling;

import java.util.Scanner;

public class TrywithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scn = new Scanner(System.in))
		{
			System.out.println("Enter Number");
			int num = scn.nextInt();
			System.out.println(num);
		}

	}

}
