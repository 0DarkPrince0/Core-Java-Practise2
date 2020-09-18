
public class BreakContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0,j=0;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i%2==0)
					continue;
				System.out.println("i"+i+"j"+j);
			}
		}
	}

}
