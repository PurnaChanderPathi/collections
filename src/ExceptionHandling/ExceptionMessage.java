package ExceptionHandling;

public class ExceptionMessage {
	void m3()
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
	}
	
	void m2()
	{
		m3();
	}
	
	void m1()
	{
		m2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionMessage p = new ExceptionMessage();
		p.m1();
	}

}
