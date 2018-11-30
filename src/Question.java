
public abstract class Question
{
	private int number;
	private String text;
	
	public Question(int n, String t)
	{
		number = n;
		text = t;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getText()
	{
		return text;
	}
	
	public void nextQuestion()
	{
		number++;
	}
	
	public abstract String getSolution();
	
}
