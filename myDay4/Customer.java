package myDay4;

public class Customer {

	private String custNo;
	private String custName;
	private String category;
	
	
	public Customer(String custNo, String custName, String category) {
		try {
			if (custNo.charAt(0) == 'c' || custNo.charAt(0) == 'C')
		{
			if (custName.length() > 3)
			{
				if (category.equals("Platinum") || category.equals("Gold") || category.equals("Silver"))
						{
					this.custNo = custNo;
					this.custName = custName;
					this.category = category;
						}
			}
			
		}
		
		
		else
		{
			throw new InvalidInputException("Im in invalid block exception");
		}
	}
	catch (InvalidInputException e) {
		e.printStackTrace();
	}
		
		}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName
				+ ", category=" + category + "]";
	}






	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}






	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
