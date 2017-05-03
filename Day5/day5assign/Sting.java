package day5assign;

public class Sting {

	public static void main(String[] args) {
	
		String s="qww";
		String q="qww";
		String o="abc";
		StringBuilder z= new StringBuilder("uio");
		StringBuilder x= new StringBuilder("uio");
		
		System.out.println(s.equals(q));
		System.out.println(s==q);
		
		System.out.println(z==x);
		System.out.println(z.equals(x));
		
		System.out.println(z.append(x));
		
		System.out.println(z.append(s));
		System.out.println(z);
		//System.out.println();
	}

}
