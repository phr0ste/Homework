public class CourseGrades 
{
	// Declares fields and stores them in the array
	// @ grades []
	private GradedActivity oLab;
	private PassFailExam passFail;
	private Essay essay;
	private FinalExam finalExam;
	private GradedActivity[] grades = {oLab, passFail, essay, finalExam};
	
/** Constructor for CourseGrades
 * 
 * @param oLab
 * @param passFail
 * @param essay
 * @param finalExam
 */
public CourseGrades(GradedActivity oLab, PassFailExam passFail, Essay essay, FinalExam finalExam)
{
	setLab(oLab);
	setPassFailExam(passFail);
	setEssay(essay);
	setFinalExam(finalExam);
}
	
/** Creates reference variable
 * @param oLab 
 */
	
public void setLab(GradedActivity oLab) 
{
	this.oLab = oLab;
}

/** Creates reference variable 
 * @param passFail
 */

public void setPassFailExam(PassFailExam passFail) 
{
	this.passFail = passFail;
	
}

/** Creates reference variable 
 * @param essay
 */

public void setEssay(Essay essay) 
{
	this.essay = essay;
}

/** Creates reference variable 
 * @param finalExam
 */

public void setFinalExam(FinalExam finalExam)
{
	this.finalExam = finalExam;
}

/** Gives a print out of the scores achieved by the student in the form
 * of a numeric score and as a letter grade
 * @param str 
 * @return 
 */

public String toString() 
{
	 return "Lab Score: " + oLab.getScore() + "   Grade: " + oLab.getGrade() + System.lineSeparator() + 
			"Pass/Fail Exam Score: " + passFail.getScore() + "   Grade: " + passFail.getGrade() + System.lineSeparator() +
			"Essay Score: " + essay.getScore() + "   Grade: " + essay.getGrade() + System.lineSeparator() +
			"Final Exam Score: " + finalExam.getScore() + "   Grade: " + finalExam.getGrade();

} 

}