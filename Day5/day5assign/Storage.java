package day5assign;

public class Storage extends Thread{

	int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	
	public Storage(int i) {
		super();
		this.i = i;
		System.out.println("from constructor: value setting: "+i);
	}

	@Override
	public String toString() {
		return "Storage [i=" + i + "]";
	}
	
	
	
	
}
