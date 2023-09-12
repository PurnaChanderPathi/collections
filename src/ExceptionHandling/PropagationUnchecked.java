package ExceptionHandling;

public class PropagationUnchecked {
	void m3()
	{
		System.out.println(10/0);
	}
	void m2()
	{
		m3();
	}
	void m1()
	{
		try
		{
		m2();
		}
		catch(ArithmeticException a)
		{
			System.out.println(10/2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropagationUnchecked p = new PropagationUnchecked();
		p.m1();
		

	}

}
