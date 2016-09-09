import java.io.Serializable;

/**
 * The TestScores class is a serializable class
 * that stores data about a test for the
 * TestScores Modification for Serialization 
 * programming challenge.
 * @author phr0st
 *
 */

public class TestScores implements Serializable {
	
	// Variable to reference an array of test scores
	private double[] scores;


	
public TestScores(double[] t) throws IllegalArgumentException
{
	// Create an array to hold the scores passed
	// as an argument
	scores = new double[t.length];
	
	// Copy the scores passed as an argument into
	// the new array. Check for illegal values as
	// they are copied
	for (int i = 0; i < t.length; i++)
	{
		if (t[i] < 0 || t[i] > 100)
			throw new IllegalArgumentException("Element: " + i + "Score: " + t[i]);
		else
			scores[i] = t[i];
	}
}	


/**
 * The getAverage method returns the average
 * of the object's test scores.
 * @return The average of the objects test scores
 */

public double getAverage()
{
	double total = 0.0; // Accumulator
	
	// Accumulate the sum of the scores.
	for (int i = 0; i < scores.length; i++)
		total += scores[i];
	
	// return the average
	return (total / scores.length);
		
	}


/**
 * toString method
 * (Addd for this assignment.)
 * @return A string representation of an object
 */

public String toString()
{
	String str = "Scores: ";
	
	for (int i = 0; i < scores.length; i++)
		str += scores[i] + " ";
	
	str += " Average =" + getAverage();
	return str;
}

}

