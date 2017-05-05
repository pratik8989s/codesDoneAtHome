package midterm;
import java.lang.Math;

public class TechnicalRound {

	int technicalSubjectLevel;
	
	public int technicalInterview(int writtenScore,Student student)
	{
		technicalSubjectLevel=(int)(Math.random()*10);
			//System.out.println(technicalSubjectLevel);
		return technicalSubjectLevel;
	}
}
