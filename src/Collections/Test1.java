package Collections;

import java.util.ArrayList;

public class Test1 {
	//version 1.5 supports auto Boxing

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.5);
		al.add(null);
		al.add('A');
		al.add(10.4f);
		al.add("Eidiko");
		//up to 1.4 version we have no auto Boxing
		ArrayList p = new ArrayList();
		p.add(Integer.valueOf(9));
		p.add(Double.valueOf(10.7));
		p.add(null);
		p.add(Character.valueOf('P'));
		p.add(Float.valueOf(9.4f));
		p.add(String.valueOf("Pathi"));
		System.out.println(al);
		System.out.println(p.toString());
		
		
	}

}
