package str;

public class ReverseArray {

	
	public static void main(String[] args) {

		int array[],i,j,limit;
		System.out.println("How many Numbers do you want to Enter");
		limit=new java.util.Scanner(System.in).nextInt();
		array=new int[limit];
		System.out.println("Enter Numbers Now :");
		for(i=0;i<array.length;i++)
		{
			System.out.println("Enter Number "+(i+1));
			array[i]=new java.util.Scanner(System.in).nextInt();
		}
		j=array.length-1;
		for(i=0;i<j;i++)
		{
			int temp;
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			j--;
			
		}
		System.out.println("Reverse Array=");
		for(i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}

}
