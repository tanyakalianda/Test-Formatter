
public abstract class Question
{
	private static int nextNum = 1;      //static -> 1 variable that EVERY OBJECT shares       
	private int number;
	private String text;
	
	public Question(String t)
	{
		number = nextNum;           //or this.number = nextNum (this.number refers to the field)
		text = t;
		nextNum++;          //increments each question on its own -> first question =1 -> increments -> 2nd question = 2
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getText()
	{
		return text;
	}
	
	public abstract String getSolution();
	
}
