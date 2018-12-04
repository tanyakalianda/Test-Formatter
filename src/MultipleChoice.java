
public class MultipleChoice extends Question
{
	private String[] answerChoices;
	private char correctAnswer;
	
	public MultipleChoice(String t, String[] choices, char ans)
	{
		super(t);          //calling the super constructor MUST be the first line (or else it will call the default constructor, which doesn't exist)
		answerChoices = choices;
		correctAnswer = ans;
	}
	
	public String toString()
	{
		String ques = "";
		ques += getNumber();        //the object that is going to run getNumber is the object already in the toString method
		//or ques += this.getNumber();   -> "this" takes the place of the implicit parameter
		ques += "__________";
		ques += this.getText() + "\n";    //new line
		char choice = 'A';
		for (String ans: answerChoices)
		{
			ques += "\t" + choice + ". " + ans + "\n";
			choice++;         //can increment characters b/c its a primitive data type
		}
		return ques;
	} 
	
	public String getSolution()
	{
		return "Correct Answer: " + correctAnswer;
	}
	
}
