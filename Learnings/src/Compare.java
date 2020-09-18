
public class Compare 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String s="FAHEEM";
		String s1="Faheem";
		int result;
		result=s.compareTo(s1);
		if(result<0)
		{
			System.out.println("First");
		}
		if(result>0)
		{
			System.out.println("Second");
			
		}
		if(result==0)
		{
			System.out.println("Equal");
		}
		
	}

}
