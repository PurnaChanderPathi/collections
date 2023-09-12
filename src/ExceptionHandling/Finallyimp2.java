package ExceptionHandling;

public class Finallyimp2 {
	int m1()
	{
		try
		{
			return 10;
		}
		catch(ArithmeticException a)
		{
			return 20;
		}
		finally
		{
			return 30;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finallyimp2 f = new Finallyimp2();
		int x = f.m1();
		System.out.println(x);

	}

}
