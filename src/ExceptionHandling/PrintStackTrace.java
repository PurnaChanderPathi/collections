package ExceptionHandling;

public class PrintStackTrace {
	void m3()
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException a)
		{
			//System.out.println(a.getMessage());
			a.printStackTrace();
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
		PrintStackTrace p = new PrintStackTrace();
		p.m1();

	}

}
