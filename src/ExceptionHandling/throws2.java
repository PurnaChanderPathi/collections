package ExceptionHandling;

public class throws2 {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throws1 t = new throws1();
		try
		{
		t.officeboy();
		}
		catch(InterruptedException a)
		{
			System.out.println(a);
		}

	}

}
