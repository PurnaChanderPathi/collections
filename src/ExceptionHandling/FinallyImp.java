package ExceptionHandling;

public class FinallyImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException a)
		{
			System.out.println("Pathi".charAt(10));
		}
		finally
		{
			int [] a = {0,1,2,3,4};
			System.out.println(a[10]);
		}

	}

}
