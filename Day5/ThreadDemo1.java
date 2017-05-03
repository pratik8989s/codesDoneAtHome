
public class ThreadDemo1 {

	public static void main(String[] args) {

		Thread nw = new Thread(new NewThread1());
		
		nw.start();
		
		
	}

}
