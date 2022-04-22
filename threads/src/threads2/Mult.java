package threads2;

public class Mult implements Runnable{
	public void run()
	{
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mult m1=new Mult();
		Thread t1 = new Thread(m1);
		t1.start();

	}

}
