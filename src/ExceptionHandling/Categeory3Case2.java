package ExceptionHandling;

import java.io.*;


public class Categeory3Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Thread.sleep(3000);
		}catch(InterruptedException a)
		{
			System.out.println(a);
		}
		System.out.println("Rest of the code");

	}

}
