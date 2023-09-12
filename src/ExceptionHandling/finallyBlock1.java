package ExceptionHandling;

public class finallyBlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(10/0);
//		}catch(ArithmeticException a)
		}catch(StringIndexOutOfBoundsException a)
		{
			System.out.println(a);
		}
		finally
		{
			System.out.println("Rest of the code");
		}

	}

}
