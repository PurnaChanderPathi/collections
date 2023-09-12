package SetCollections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExp  {
	
	void serialization() throws IOException
	{
		EmpMarkImpl e = new EmpMarkImpl(18, "Virat");
		FileOutputStream fis = new FileOutputStream("abc.txt");
		ObjectOutputStream obj = new ObjectOutputStream(fis);
		obj.writeObject(e);
		obj.close();
		System.out.println("Serialization Process Completed");
	}
	
	void Deserialization() throws IOException, ClassNotFoundException
	{
		FileInputStream fos = new FileInputStream("abc.txt");
		ObjectInputStream obj1 = new ObjectInputStream(fos);
		EmpMarkImpl e =(EmpMarkImpl)obj1.readObject();
		System.out.println(e.id+" "+e.name);
		obj1.close();
		
		
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializationExp se = new SerializationExp();
		se.serialization();
		se.Deserialization();
	
		

	}

}
