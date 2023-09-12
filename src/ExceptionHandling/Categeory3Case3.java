package ExceptionHandling;


public class Categeory3Case3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try
	{
		Thread.sleep(3000);
		
	}catch(InterruptedException|ArithmeticException i)
	{
		System.out.println(i);
	}
	System.out.println("Rest of the code");

	}

}
