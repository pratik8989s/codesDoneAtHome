package midterm;

public class EligibilityCriteria {

	int requiredPercentage;
	int maxNoOfBacklogsAllowed;
	public static boolean selected;
		
	public int getRequiredPercentage() {
		return requiredPercentage;
	}

	public void setRequiredPercentage(int requiredPercentage) {
		this.requiredPercentage = requiredPercentage;
	}

	public int getMaxNoOfBacklogsAllowed() {
		return maxNoOfBacklogsAllowed;
	}

	public void setMaxNoOfBacklogsAllowed(int maxNoOfBacklogsAllowed) {
		this.maxNoOfBacklogsAllowed = maxNoOfBacklogsAllowed;
	}

	public EligibilityCriteria(int requiredPercentage,
			int maxNoOfBacklogsAllowed) {
		super();
		this.requiredPercentage = requiredPercentage;
		this.maxNoOfBacklogsAllowed = maxNoOfBacklogsAllowed;
	}

	public EligibilityCriteria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean minimumEligibility(Student student)
	{
		if(student.marksInPercentage>=requiredPercentage)
		{
			if(student.noOfBacklogs<=maxNoOfBacklogsAllowed)
			{
				return true;
			}
			else
				return false;
		}
		else
		   return false;
	}
}
