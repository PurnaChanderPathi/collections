package ExceptionHandling;

public class throws6 {
	void m1()
	{
		System.out.println(10/0);
	}
	
	void m2()
	{
		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throws6 t= new throws6();
		try
		{
		t.m2();
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}

	}

}
