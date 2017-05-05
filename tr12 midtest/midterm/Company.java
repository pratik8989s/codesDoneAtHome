package midterm;

public class Company {

	String companyName;
	float salaryOfferedInLPA;
	EligibilityCriteria eligibilityCriteria;
	WrittenTest writtenTest;
	TechnicalRound technicalRound;
	HRRound hrRound;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public float getSalaryOfferedInLPA() {
		return salaryOfferedInLPA;
	}
	public void setSalaryOfferedInLPA(float salaryOfferedInLPA) {
		this.salaryOfferedInLPA = salaryOfferedInLPA;
	}
	public Company(String companyName, float salaryOfferedInLPA,
			EligibilityCriteria eligibilityCriteria, WrittenTest writtenTest,
			TechnicalRound technicalRound, HRRound hrRound) {
		super();
		this.companyName = companyName;
		this.salaryOfferedInLPA = salaryOfferedInLPA;
		this.eligibilityCriteria = eligibilityCriteria;
		this.writtenTest = writtenTest;
		this.technicalRound = technicalRound;
		this.hrRound = hrRound;
	}	
}
