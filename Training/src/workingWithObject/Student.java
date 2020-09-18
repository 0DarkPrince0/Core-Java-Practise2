package workingWithObject;

public class Student 
{
	private String name;
	private Subjects subjects;
 
 	public void setName(String name)
 	{
 		this.name=name;
 	}
 	public String getName()
 	{
 		return name;
 	}
 	
 	public void setSujects(Subjects subjects)
 	{
 		this.subjects=subjects;
 	}
 	public Subjects getSubjects()
 	{
 		return subjects;
 	}
 	
 	@Override
 	 public String toString()
 	 {
 		 return "Name: "+name+ "\n"+ "Subjects: "+ subjects;
 		 
 	 }
}
	
 