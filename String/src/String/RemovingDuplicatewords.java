package String;

public class RemovingDuplicatewords 
{

	
	public static void main(String[] args) 
	{
		String str="I am a boy. boy I do my work on time. I am honest";
		
		
		String array[]=str.split(" ");
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i].equalsIgnoreCase(array[j]))
				{
					if(i!=j)
					{
						array[j]=" ";
					}
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=" ")
			{
				System.out.print(array[i]+" ");
			
			}
		}
	}

}
