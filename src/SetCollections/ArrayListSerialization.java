package SetCollections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<EmpMarkImpl> al = new ArrayList<EmpMarkImpl>();
		al.add(new EmpMarkImpl(18, "Virat"));
		al.add(new EmpMarkImpl(45, "Rohit"));
		al.add(new EmpMarkImpl(07, "Dhoni"));
		
		//Serialization  of ArrayList Writing Letter
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream obj = new ObjectOutputStream(fos);
		obj.writeObject(al);
		obj.close();
		System.out.println("Serialization Process Completed");
		
		//DeSerialization of ArrayList Reading letter
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream obj1 = new ObjectInputStream(fis);
		ArrayList<EmpMarkImpl> e=(ArrayList<EmpMarkImpl>)obj1.readObject();
		obj1.close();
		for(EmpMarkImpl e1:al)
		{
		System.out.println(e1.id+" "+e1.name);
		}
		
		
	}

}
