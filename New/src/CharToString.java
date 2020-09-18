
public class CharToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char array[]={'a','b','c'};
		String s="";
		for(int i=0;i<array.length;i++)
		{
			char ch=array[i];
			s=s+ch;
		}
		System.out.println(s);
	}

}
