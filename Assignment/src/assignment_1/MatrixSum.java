package assignment_1;

public class MatrixSum 
{

	public void matrixSum(int mat1[][],int mat2[][])
	{
		int i,j,mat3[][]=new int[3][3];
		for(i=0;i<mat1.length;i++)
		{
			for(j=0;j<mat1[i].length;j++)
			{
				mat3[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		for(i=0;i<mat3.length;i++)
		{
			for(j=0;j<mat3[i].length;j++)
			{
				System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		
		int array1[][]={{1,4,3},{5,2,6},{9,3,8}};
		int array2[][]={{2,5,1},{7,5,3},{7,3,9}};
		MatrixSum ms=new MatrixSum();
		ms.matrixSum(array1, array2);
	}

}
