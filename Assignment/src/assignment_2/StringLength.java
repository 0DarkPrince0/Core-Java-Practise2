package assignment_2;

public class StringLength 
{

	static public int stringLen(String str)
	{
		int length=0,i;
		char ch[]=str.toCharArray();
		for(i=0;i<ch.length;i++)
		{
			length=length+1;
		}
		
		return length;
	}
	public static void main(String[] args) 
	{
		String str="Faheem";
		int length;
		length=StringLength.stringLen(str);
		System.out.println("Length: "+length);
		

	}

}
