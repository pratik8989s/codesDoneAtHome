package myDay4;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter custNo");
		String custnumber = input.next();
		System.out.println("enter custName");
		String customername =input.next();
		System.out.println("enter category");
		String custcat = input.next();
		
		Customer obj = new Customer(custnumber, customername, custcat);
		
		System.out.println(obj);
		
		
		
	}

}
