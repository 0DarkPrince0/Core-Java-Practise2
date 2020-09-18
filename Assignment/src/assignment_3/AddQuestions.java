package assignment_3;
import java.util.LinkedList;

public class AddQuestions 
{
	private int answer;
	private String question;
	private LinkedList<AddOption> options;
	
	
	public AddQuestions()
	{
		options=new LinkedList<AddOption>();
	}
	public void setQuestion(String question)
	{
		this.question=question;
	}
	public String getQuestion()
	{
		return question;
	}

	public void setOption(LinkedList<AddOption> options)
	{
		this.options=options;
	}
	public LinkedList<AddOption> getOption()
	{
		return options;
	}
	public void setAnswer(int answer)
	{
		this.answer=answer;
	}
	public int getAnswer()
	{
		return answer;
	}
	@Override
	public String toString()
	{
		return question+" "+" "+options+"\n";
	}
}
