package midterm;

public class Student {

	int id;
	String name;
	int marksInPercentage;
	int noOfBacklogs;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarksInPercentage() {
		return marksInPercentage;
	}

	public void setMarksInPercentage(int marksInPercentage) {
		this.marksInPercentage = marksInPercentage;
	}

	public int getNoOfBacklogs() {
		return noOfBacklogs;
	}

	public void setNoOfBacklogs(int noOfBacklogs) {
		this.noOfBacklogs = noOfBacklogs;
	}

	public Student(int id, String name, int marksInPercentage, int noOfBacklogs) {
		super();
		this.id = id;
		this.name = name;
		this.marksInPercentage = marksInPercentage;
		this.noOfBacklogs = noOfBacklogs;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	void studentdetails()
	{
		System.out.println("Student Details of "+name);
		System.out.println("-------------------------------");
		System.out.println("Student ID:"+id);
		System.out.println("Student marks in percentage:"+marksInPercentage);
		System.out.println("Student BackLogs:"+noOfBacklogs);
		System.out.println("-------------------------------");
	}
	
}
