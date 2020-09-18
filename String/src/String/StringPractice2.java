package String;
public class StringPractice2 
{
	public static void main(String[] args)
	{
		int i,j,count,len,k=0;;
		System.out.println("Enter the String=");
		String str1=new java.util.Scanner(System.in).next();
		char ch[]=str1.toCharArray();
		char ch1[];
		len=ch.length;
		ch1=new char[len];
		System.out.println(len);
		for(i=0;i<ch.length;i++)
		{
			count=0;
			for(j=0;j<i;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				
				ch1[k]=ch[i];
				k++;
			}
		}
		//System.out.println(ch1);
		
		
		for(i=0;i<k;i++)
		{
			System.out.print(ch1[i]);
		}
		/*String str="";
		for(i=0;i<ch.length;i++)
		{
			count=0;
			for(j=0;j<str.length();j++)
			{
				if(ch[i]==str.charAt(j))
				{
					count++;
				}
			}
			if(count==0)
			{
				str=str+ch[i];
			}
		}
		System.out.println("String is="+str);*/
	}

}
