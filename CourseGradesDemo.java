import java.util.Scanner;

public class CourseGradesDemo 
{
/** Declares scanners to be used to accept input
 * from the user
 */
	private static Scanner qMissed;
	private static Scanner enterGrades;
	private static Scanner ePoints;
	private static Scanner fPoints;

	public static void main(String[] args) {
		
	/** Creates the objects to be passed to the
	 new instance of CourseGrades @ scores
	 Displays the numeric and letter grades
	 Of the assignments
	*/
		
		
		GradedActivity lab = getLabScore();
		PassFailExam passFail = getPFScore();
		Essay essay = getEScore();
		FinalExam finalExam = getFEScore();
		CourseGrades scores = new CourseGrades(lab, passFail, essay, finalExam);
		System.out.println(scores.toString());
	}
	
	/** Creates a new GradedActivity object
	 Prompts user to enter a grade for the Lab Activity
	Sets the score based on the user input
	Returns the user input
	*/
	
	public static GradedActivity getLabScore()
	{
		enterGrades = new Scanner(System.in);
		GradedActivity lab = new GradedActivity();
		System.out.println("Please enter a score for the Lab Activity: ");
		lab.setScore(enterGrades.nextDouble());  
		
		return lab;  
	}
	
	/** Declares and initializes the number of questions in variable q
	 declares a questions missed variable
	 declares and initializes the minimum score @ variable score
	   prompts the user to set the value of questions missed @ qM
	 */
	public static PassFailExam getPFScore()
	{
		qMissed = new Scanner(System.in);
		int q = 10;
		int qM;
		int score = 70;
		System.out.println("Please enter the number of questions missed for the Pass/Fail Exam: ");
		qM = qMissed.nextInt();
		
		return new PassFailExam(q, qM, score);
		
	}
	
	/** Declares 4 variables used in calculating total points for the essay
	 @ gr, sp, len, con
	 Prompts the user to enter the individual points
	 Had to create constructor in Essay.java to pass the values through
	 Returns the score of the essay
	 */
	
	public static Essay getEScore()
	{
		ePoints = new Scanner(System.in);
		double gr, sp, len, con;
		//Changed original user prompt to include point totals for each individual score.
		// Will only output correctly if totals are exact.
		System.out.println("Enter points for Grammar(0-30), Spelling (0-20), Length (0-20), and Content (0-30)");
		gr = ePoints.nextDouble();
		sp = ePoints.nextDouble();
		len = ePoints.nextDouble();
		con = ePoints.nextDouble();
		
		
		return new Essay(gr, sp, len, con); // The result returned is buggy. Need exception/validation method
	}
	
	/** Declares and initializes the number of questions on the exam @
	 variable q.
	 Declares the questions missed @ variable qM
	 prompts the user to enter how many questions were missed
	 */
	
	public static FinalExam getFEScore()
	{
		fPoints = new Scanner(System.in);
		int q = 50;
		int qM;
		System.out.println("Enter number of questions missed for the Final Exam: ");
		qM = fPoints.nextInt();
		
		return new FinalExam(q, qM);
		
	}
}
