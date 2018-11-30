
public class MultipleChoice extends Question
{
	private String[] AnswerChoices;
	private char correctAnswer;
	
	public MultipleChoice(int n, String t, String[] choices, char ans)
	{
		super(n, t);
		AnswerChoices = choices;
		correctAnswer = ans;
	}
	
	public String toString()
	{
		return "Question " + getNumber() + ": " + getText(); 
	}
	
	public String[]
	
	public String getSolution()
	{
		return "Correct Answer: " + correctAnswer;
	}
	

	
}
