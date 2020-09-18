package assignment_2;

public class Squeeze {

	static public String squeeze(String str)
	{
		String str1="";
		int i;
		char ch[]=str.toCharArray();

		for(i=0;i<ch.length;i++)
		{
			if(ch[i]==' ' && str1!=null)
			{
				continue; 
			}
			else
			{
				str1=str1+ch[i];
			}
		}
		return str1;
	}
	public static void main(String[] args)
	{
		String str="    good morning india    ";
		String str1=Squeeze.squeeze(str);
		System.out.println(str);
		System.out.println(str1);
		
		

	}

}
