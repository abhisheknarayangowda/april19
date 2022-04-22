 class ThreadClas extends Thread
{
	public void run()
	{
		super.run();
		System.out.println("thread starts");
	}
}
public class Mains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadClas thread = new ThreadClas();
thread.start();
	}

}
