package assignment_3;

public class AddOption 
{
	private String option;
	public void setOption(String option)
	{
		this.option=option;
	}
	public String getOption()
	{
		return option;
	}
	@Override
	public String toString()
	{
		return option+"\n ";
	}
}

