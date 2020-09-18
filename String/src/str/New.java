package str;

public class New {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="faheem";
		String s1="Faheem";
		int result;
		result=s.compareTo(s1);
		System.out.println(result);
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
