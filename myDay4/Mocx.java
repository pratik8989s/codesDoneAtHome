package myDay4;

import java.util.Scanner;

public class Mocx {

	public static void main(String[] args) {
		
					
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("enter first no.");
		float num1 = input.nextFloat();
		System.out.println("enter second no.");
		float num2 = input.nextFloat();
		
		//System.out.println(num1+" "+num2);
		
		Formulas obj = new Formulas();
		
		obj.add(num1, num2);
		obj.sub(num1, num2);
		obj.div(num1, num2);
		obj.mul(num1, num2);
	}

}
