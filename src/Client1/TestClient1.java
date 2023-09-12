package Client1;
import Declaration.Message;

class TestClient1 implements Message {
	
	public void mrng()
	{
		System.out.println("Good Morning");
	}
	public void evng()
	{
		System.out.println("Good Evening");
	}
	public void gudnyt()
	{
		System.out.println("Good Night");
	}

	public static void main(String[] args) {
		TestClient1 t = new TestClient1();
		t.mrng();
		t.evng();
		t.gudnyt();
	}
}
