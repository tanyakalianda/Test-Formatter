
public class TrueFalse extends Question
{
	private String Answer;
	
	public TrueFalse(String t, String a)
	{
		super(t);
		Answer = a;
	}
	
	public String toString()
	{
		return "Question " + getNumber() + ": " + " True or False" + getText();
	}
	
	public String getSolution()
	{
		return Answer;
	}
}
