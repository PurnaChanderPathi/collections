package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throws4 {
	
	void m1() throws Exception
	{
		System.out.println("pathi");
		Thread.sleep(3000);	
		FileInputStream fis = new FileInputStream("abc.text");
		System.out.println("Rest");
	}
	void m2()
	{
		try
		{
		m1();
		}
		catch(Exception f)
		{
			System.out.println(f);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throws4 t = new throws4();
		t.m2();

	}

}
