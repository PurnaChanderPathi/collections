package ExceptionHandling;

public class throws1 {
	void studentDetails() throws InterruptedException
	{
	
		System.out.println("Purna Sleeping");
		Thread.sleep(3000);
		System.out.println("pathi");
	}
	
	void hod() throws InterruptedException
	{
		studentDetails();
	}
	
	void principal() throws InterruptedException
	{
		hod();
	}
	void officeboy() throws InterruptedException
	{
		principal();
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		throws1 t = new throws1();
		t.officeboy();

	}

}
