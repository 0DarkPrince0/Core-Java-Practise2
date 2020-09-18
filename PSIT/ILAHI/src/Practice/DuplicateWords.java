package Practice;

public class DuplicateWords
{
 
	public static void main(String args[])
	{
		System.out.println("Input String");
		String input="She is a girl . Her name is Sonali . Sonali is a beautiful girl and she is very nice to talk";
		System.out.println(input);
		countWords(input);
		// a(1);
	}
 
	// static void a(Int id)
	static void countWords(String st)
	{
		// split text to array of words
		String[] words = st.split(" ");
 
		// clean duplicates
		for (int i = 0; i < words.length; i++)
		{
			
			for (int j = 0; j < words.length; j++)
			{
				if (words[i].equalsIgnoreCase(words[j]))
				{
					
					if (i != j)
						words[j] = " ";
 
				}
			}
		}
 
		// show the output
 
		System.out.println("Removing Duplicate words:\n");
		for (int i = 0; i < words.length; i++)
		{
 
			if (words[i] != " ")
			{
				System.out.print(words[i]+" ");
 
			}
		}
	}
}


