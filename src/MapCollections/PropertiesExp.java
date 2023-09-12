package MapCollections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExp {

	public static void main(String[] args) throws IOException {
		//Load the properties file
		FileInputStream fis = new FileInputStream("abc.properties");
		Properties properties = new Properties();
		properties.load(fis);
		
		//read Properties
		System.out.println(properties.get("username"));
		System.out.println(properties.get("password"));

	}

}
