package str;

public class PrimeNumeric {

	
	public static void main(String[] args)
	{

		int number=5; // We can put the any number here
		int i,temp,temp1=0;
		String array[]=new String[10];
		boolean isprime=true;
		
		
			array[0]="zero";
			array[1]="one";
			array[2]="two";
			array[3]="three";
			array[4]="four";
			array[5]="five";
			array[6]="six";
			array[7]="seven";
			array[8]="eight";
			array[9]="nine";
		if(((number%2)==0)||((number%3)==0)||((number%5)==0)||((number%7)==0)||((number%11)==0))
		{
			isprime=false;
		}
	
		if(isprime)
		{
			System.out.print("Number is prime ");
		
		while(number!=0)
		{
			temp=number%10;
			temp1=temp1*10+temp;
			number=number/10;
		}
		while(temp1!=0)
		{
			temp=temp1%10;
			System.out.print(array[temp]+" ");
			
			temp1=temp1/10;
		}
		}
		else
		{
			System.out.println("number is not prime");
		}
	}

}
