package SetCollections;

public class CloneExp implements Cloneable {
	int a =10;
	int b = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		CloneExp c1 = new CloneExp();
		System.out.println(c1.a);
		System.out.println(c1.b);
		
		CloneExp c2=(CloneExp)c1.clone();
		System.out.println(c2.a);
		System.out.println(c2.b);
	}

}
