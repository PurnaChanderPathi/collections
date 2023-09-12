package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throws3 {
	
	void m1() throws InterruptedException, FileNotFoundException
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
		catch(InterruptedException|FileNotFoundException f)
		{
			System.out.println(f);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throws3 t = new throws3();
		t.m2();

	}

}
