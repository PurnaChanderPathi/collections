package ExceptionHandling;

public class Error {
	void m1()
	{
		m2();
	}
	void m2()
	{
		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a =new int[10000000000]; //out of memory error :java heap space
		
		//new Error().m1(); //java.lang.StackOverflowError
		
		//NoClassDefFoundError: demo class name

	}

}
