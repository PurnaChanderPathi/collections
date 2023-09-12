package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TrywithResourceinCheckedException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("bac.txt"))
		{
			System.out.println("Hello sir");
		}
		catch(FileNotFoundException f1)
		{
			System.out.println(f1);
		}
		System.out.println("rest of the code");

	}

}
