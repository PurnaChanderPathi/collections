package Client1;

import java.util.Scanner;

public class EligibleAgeforVote {
	static void status(int age) throws AgeNotEligible
	{
		if(age>20)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			throw new AgeNotEligible("not Eligible for vote");
		}
		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your Age");
		int age = scn.nextInt();
		try {
			EligibleAgeforVote.status(age);
		} catch (AgeNotEligible e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
