package threads1;

public class Multi extends Thread {
	public void run()
	{
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi t1 = new Multi();
		t1.start();

	}

}
