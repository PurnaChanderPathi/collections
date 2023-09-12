package ExceptionHandling;

public class GetMessage {
	void m3()
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException a)
		{
			System.out.println(a.getMessage());
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
		GetMessage p = new GetMessage();
		p.m1();
		// TODO Auto-generated method stub
		

	}

}
