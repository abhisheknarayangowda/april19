
public class Mythreads implements Runnable {
	public void run()
	{
		System.out.println("now the thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new Mythreads();
		Thread th1=new Thread(r1,"my new thread");
		th1.start();
		String str=th1.getName();
		System.out.println(str);

	}

}
