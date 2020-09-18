package workingWithObject;

public class Subjects 
{
	private int hindi;
	private int english;
	private int math;
	public void setHindi(int hindi)
	{
		this.hindi=hindi;
 	
	}
	public int getHindi()
	{
		return hindi;
	}
	public void setEnglish(int english)
	{
		this.english=english;
	}
	public int getEnglish(int english)
	{
		return english;
	}
	public void setmath(int math)
	{
		this.math=math;
	}
	public int getMath(int math)
	{
		return math;
	}
	
	@Override
	public String toString()
	{
		return "Hindi: "+hindi+", English: "+english+", Math: "+ math;
	}
	
}

