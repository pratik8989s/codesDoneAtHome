package myDay4;

public class Employee2 {

	int x;

	public Employee2(int x) {
		super();
		this.x = x;
	}
	
	public void calc() {
	final int sa=12;
	x=x+sa;
	System.out.println(x);
	}

	
	
	
	/*public Employee2(int x) {
		super();
		this.x = x;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {			
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee2 other = (Employee2) obj;
		if (x != other.x)
			return false;
		return true;
	}
	
	
}
