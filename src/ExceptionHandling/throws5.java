package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throws5 {
	void m1() throws InterruptedException, FileNotFoundException 
	{
		System.out.println("pathi");
		Thread.sleep(3000);	
		FileInputStream fis = new FileInputStream("abc.text");
		System.out.println("Rest");
	}
	void m2() throws FileNotFoundException
	{
		try
		{
		m1();
		}
		catch(InterruptedException f)
		{
			f.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throws5 t = new throws5();
		try
		{
		t.m2();
		}catch(FileNotFoundException i)
		{
			i.printStackTrace();
		}

	}

}
