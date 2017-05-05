package midterm;
import java.util.Scanner;

public class PlacementCell {

	boolean isSelected(int technicalScore,int hrScore)
	{
		int total=technicalScore+hrScore;

    	if(total>=10)
    	{
    	  //System.out.println("Congratulations!!!!!!!!!! you are now an employee of TechMahindra");
    	  return true;
    	}
    	else
    	  return false;
    	
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     

		
		Company company;
		
		Scanner input=new Scanner(System.in);

		System.out.println("Enter Company name:");
		String cname=input.next();
		
		System.out.println("Enter salary offered: ");
		float sal=input.nextFloat();
		
		System.out.println("Enter Student ID:");
		int sid=input.nextInt();
		
		System.out.println("Enter Student Name:");
		String sname=input.next();
		
		System.out.println("Enter Student marks in percentage:");
		int sper=input.nextInt();
		
		System.out.println("Enter Student no of backlogs:");
		int sbl=input.nextInt();
		
		Student s=new Student(sid,sname,sper,sbl);
		//s.studentdetails();
		
	    System.out.println("Enter required percentage:");
	    int rper=input.nextInt();

	    System.out.println("Enter maximun no of backlogs allowed:");
	    int maxbl=input.nextInt();
	    
	    EligibilityCriteria ec=new EligibilityCriteria(rper,maxbl);
	    
	    if(ec.minimumEligibility(s)==true)
	    {
	    	s.studentdetails();
	    	
	    	WrittenTest wt=new WrittenTest();
	    	System.out.println(sname+" is writting the writtenTest");
	    	int wtscore=wt.writtenTest(s);
	    	System.out.println("Your written test score is:"+wtscore);
	    	//int wtscore=wt.writtenTest(s);
	    	if(wtscore>=50)
	    	{
	    	System.out.println(sname+" please select(number) your areas of interest from the following:"
	    			+ "1:Java"
	    			+ "2.DBMS"
	    			+ "3.Networking");
	    	int num=input.nextInt();
	    	
	    	switch(num)
	    	{
	    	case 1:System.out.println(sname+" is being inteviewed on Java");
	    	       break;
	    	case 2:System.out.println(sname+" is being inteviewed on DBMS");
 	               break;
	    	case 3:System.out.println(sname+" is being inteviewed on Networking");
 	               break;
 	        default:System.out.println("Enter number between 1 and 3 only");
	    	}
	    	
	    	TechnicalRound tr=new TechnicalRound();
	    	
	    	tr.technicalInterview(wtscore, s);
	    	System.out.println("Please go for HR round.. your score is being evaluated");
	    	
	    	System.out.println("Your Technical Interview Score is:"+tr.technicalSubjectLevel);
	    	
	    	System.out.println(sname+" is getting interviewed for HR round");
	    	HRRound hr=new HRRound();
	    	
	    	hr.hrInterview(wtscore, s);
	    	System.out.println("Please wait.... your score is being evaluated");
	    	System.out.println("Your HR score is:"+hr.softSkillsLevel);
	    	
	    	System.out.println(sname+" has completed all the rounds of the interview");

	    	
	    	PlacementCell pc=new PlacementCell();
	    	boolean result=pc.isSelected(tr.technicalSubjectLevel, hr.softSkillsLevel);

	    	if(result==true)
	    	{
	    		System.out.println("Congratulations!!!!!!!!!! you are now an employee of TechMahindra");
	    	}
	    	else
	    		System.out.println("You are not selected");
	    	
	    	company=new Company(cname,sal,ec,wt,tr,hr);
	    	}
	    
	    else
    	{
    		System.out.println("You have not qualified writtenExam");
    	}

	    }
	}

}
