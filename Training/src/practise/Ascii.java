package practise;


public class Ascii 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s;
		
		System.out.print("Enter your string: ");
		
		s=new java.util.Scanner(System.in).nextLine();
		int i,acsii;
		for(i=0;i<s.length();i++)
		{
			
			acsii=s.codePointAt(i);
			System.out.println("Character: "+s.charAt(i)+" "+acsii);
		}
	
	
	}

}
