package practise;

import java.util.Scanner;

public class PatternWithUnderscore 
{
	public static void main(String[] args) 
	{
		int lines,temp;
		int i,j,k,l;
		System.out.print("How many lines do you want to print:-");
		Scanner sc = new Scanner(System.in);
		lines=sc.nextInt();
		for(i=1;i<=lines;i++)
		{
			temp=1;
			for(j=lines-1;j>=i;j--){
				System.out.print(" ");
				for(l=1;l<=temp;l++){
					System.out.print(" ");
				}
				temp=temp+1;
			}
			for(k=1;k<=i;k++){
				System.out.print("*");
				if(i==lines){
					for(l=1;l<=temp;l++){	
						System.out.print("-");
					}
				}
				else{
					for(l=1;l<=temp;l++){
						System.out.print(" ");
					}
				}
				temp=temp+1;
			}
			System.out.println();
		}
		
	}
}