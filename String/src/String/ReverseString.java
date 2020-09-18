package String;

public class ReverseString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str1="I love programming very much";
		String array[]=str1.split(" ");
		String str2="";
		int i,j;
		
		for(i=array.length-1;i>=0;i--)
		{

			System.out.println(i);
			str2=str2+array[i]+" ";
		}
		System.out.println(str2);

	}

}
