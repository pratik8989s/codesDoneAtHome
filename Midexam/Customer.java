package Midexam;

import java.util.Scanner;

public class Customer {

	private String customerName;
	private int customerTableNumber;
	Order order;
	int a;
	
	
	
	
	public String getCustomerName() {
		return customerName;
	}	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}	
	
	Scanner in=new Scanner(System.in);
	
	Order OrderingItems()
	{
		System.out.println("enter number of items");
		a=in.nextInt();
		int arr[][] = new int[a][2];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < 2; j++) {
				
				arr[i][j]=in.nextInt();
				
			}
		}
		
		return order;
	}
	
	void eat() {
		
		
		
		System.out.println("chaitu is eating...");

	}	
	public int getCustomerTableNumber() {
		return customerTableNumber;
	}
	public void setCustomerTableNumber(int customerTableNumber) {
		this.customerTableNumber = customerTableNumber;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}


	public Customer(String customerName, int customerTableNumber, Order order) {
		super();
		this.customerName = customerName;
		this.customerTableNumber = customerTableNumber;
		this.order = order;
	}


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	




}
