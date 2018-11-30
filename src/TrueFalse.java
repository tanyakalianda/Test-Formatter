
public class TrueFalse extends Question
{
	private String Answer;
	
	public TrueFalse(int n, String t, String a)
	{
		super(n, t);
		Answer = a;
	}
	
	public String toString()
	{
		return "Question " + getNumber() + ": " + getText() + " True or False";
	}
	
	public String getSolution()
	{
		return Answer;
	}
}
