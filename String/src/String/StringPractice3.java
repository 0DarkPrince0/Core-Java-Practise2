package String;
import java.util.*;;
public class StringPractice3 {
	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter a string:");
	        String str1 = scan.nextLine();               // input from user
	        String str2="";
	        for (int i=0;i<str1.length();i++){
	            int count=0;
	            for(int j=0;j<str2.length();j++)
	            {
	                if(str1.charAt(i)==str2.charAt(j))
	                {
	                    count++;
	                }
	            }
	            if(count==0){
	                str2 = str2+str1.charAt(i);
	            }
	        }
	        System.out.println("Output string with only unique characters:"+str2);
	        
	    }   
	}
