package day5assign;

public class Counter extends Thread {

	@Override
	public void run() {
	
		super.run();
		for (int i = 0; i < 10; i++) {
		
			Storage obj = new Storage(i);
			
			Printer pp =new Printer();
			
		pp.run(obj.getI());
			
		}
		
	}
	
	
}
