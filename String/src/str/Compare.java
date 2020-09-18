package str;

public class Compare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="faheem";
		String s2="faheem";
		String s3=new String("faheem");
		//String s4=new String("faheem");

	//	boolean b;
		System.out.println(s1.compareTo(s2));
		if(s1.equals(s3))
		System.out.println("true");
		if(s1==s2)
			System.out.println("true");
	}

}
