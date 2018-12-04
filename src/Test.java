import java.util.ArrayList;

public class Test 
{

	public static void main(String[] args) 
	{
		TrueFalse trueFalseQuestion = new TrueFalse("Is the sky blue?", "true");
		
		System.out.println(trueFalseQuestion);
		
		String[] ans = {"choice 1: ", "choice 2: ", "choice 3: ", "choice 4: "};
		MultipleChoice question = new MultipleChoice("What is the airspeed?", ans, 'A');
		
		System.out.print(question);       //this will run the toString method
		
		ArrayList<Question> test = new ArrayList<Question>();
		test.add(question);
		test.add(trueFalseQuestion);
		test.add(new TrueFalse("Colors are pretty", "true"));
		for (Question q: test)
		{
			System.out.println(q);
		}
		
	}

}
