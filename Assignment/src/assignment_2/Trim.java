package assignment_2;

public class Trim 
{
	static public String trim(String str)
	{
		String str1="";
		str1=Ltrim.ltrim(str);
		str=str1;
		str1="";
		str1=Rtrim.rtrim(str);
		return str1;
	}
	
	public static void main(String[] args) 
	{
		String str="    good morning india    ";
		String str1=Trim.trim(str);
		System.out.println(str);
		System.out.println(str1);
	}

}
