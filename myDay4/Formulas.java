package myDay4;

public class Formulas implements MathOps{

	float c;
	
	@Override
	public void add(float a, float b) {
	c=Math.max(a, b) + Math.min(a, b);
		System.out.println("addn is "+c);
	}
	
	@Override
	public void sub(float a, float b) {
	c=Math.max(a, b)-Math.min(a, b);
	System.out.println("sub is "+c);
		
	}
	
	@Override
	public void mul(float a, float b) {
	c=Math.max(a, b)*Math.min(a, b);
	System.out.println("mul is "+c);
	}
	
	@Override
	public void div(float a, float b) {
	c=Math.max(a, b)/Math.min(a, b);
	System.out.println("div is "+c);
		
	}
}
