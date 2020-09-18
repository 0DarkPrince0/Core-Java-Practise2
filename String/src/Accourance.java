import java.util.*;
public class Accourance {

	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str;
		System.out.println("Enter the String");
		str=scan.next();
		int len=str.length();
		int i,j,count;
		for(i=0;i<len;i++)
		{count=0;
			for(j=0;j<len;j++)
			{	
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}	
			}
			System.out.println("Character "+str.charAt(i)+"="+count);
		}
	}

}
