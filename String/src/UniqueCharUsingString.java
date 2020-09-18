import java.util.Scanner;
public class UniqueCharUsingString {

	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String str,str1="";
		System.out.println("Enter the string");
		str=scan.next();
		int i,j,count;
		int lenght=str.length();
		for(i=0;i<str.length();i++)
		{
			count=0;
			for(j=0;j<str1.length();j++)
			{
				if(str.charAt(i)==str1.charAt(j))
				{
					count++;
				}
			}
			if(count==0)
			{
				str1=str1+str.charAt(i);
			}
		}
		System.out.println("Unique character are="+str1);
			
	}

}
