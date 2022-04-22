
public class Mythread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Thread t = new Thread ("my 1st thread");
			t.start();
			String str=t.getName();
			System.out.println(str);
		}

	}

}
