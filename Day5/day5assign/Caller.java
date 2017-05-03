package day5assign;

public class Caller {

	public static void main(String[] args) {
		Counter c=new Counter();
		Printer p= new Printer();
		
		c.start();
		p.start();
	}

}
