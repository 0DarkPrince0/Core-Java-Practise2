package assignment_1;

public class MatrixTranspose 
{
	public int[][] matrixTranspose(int mat[][])
	{
		int i,j;
		for(i=0;i<mat.length;i++)
		{
			for(j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[j][i]);
			}
			System.out.println();
		}
		
		return mat;
		
	}
	public static void main(String[] args) 
	{
		int mat1[][]=new int[3][3];
		MatrixTranspose mt=new MatrixTranspose();
		int array[][]={{1,4,3},{5,2,6},{9,3,8}};
		mat1=mt.matrixTranspose(array);
		System.out.println(mat1);
		
		

	}

}
