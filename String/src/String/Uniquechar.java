package String;
	import java.util.HashSet;
	public class Uniquechar
	{
	    
	    public static void main (String args[])
	    {
	        boolean result=false;
	        String inputstring="Alve i@wsom";
	        System.out.println(inputstring);
	        HashSet < Character> uniquecharset= new HashSet<Character>();
	        for(int i=0;i < inputstring.length();i++)
	        {
	            result=uniquecharset.add(inputstring.charAt(i));
	            if (result == false)
	            break;
	        }
	    System.out.println(result); 
	    System.out.println(uniquecharset);
	    }
	}

