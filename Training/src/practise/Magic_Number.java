package practise;

public class Magic_Number {

	public static void main(String[] args) 
	{
		int array1[]= {1,3,2,7,5};
		int size,i,j,large=0;
		int good=0;
		int bad=0;
		size=array1.length;
		int temp=0;
		int array2[]=new int[size];
		for(i=0;i<size;i++)
		{
			array2[i]=array1[i];
		}
		for(i=0;i<array2.length;i++)
		{
			for(j=0;j<array2.length;j++) 
			{
				if(array2[i]<array2[j])
				{
					temp=array2[i];
					array2[i]=array2[j];
					array2[j]=temp;
				}
			}
		}
		for(i=0;i<size;i++)
		{
			System.out.print(array2[i]);;
		}
		System.out.println();
		i=0;
		j=0;
		while(i<size)
			{
				if(array1[i]==array2[j])
				
				{
					good=good+array1[i];
					i++;
					j++;
					System.out.println("good"+good);
				}
				else
				{
					bad=bad+array1[i];
					i++;
					j++;
					System.out.println("bad"+bad);
				}
			}
		int magic_number=good-bad;
		System.out.println("Magic Number="+magic_number);
	}

}
