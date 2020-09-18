import java.util.*;
public class ArraySort2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[3];
		array[0]=2;
		array[1]=5;
		array[2]=1;
		ArrayDeque.sort(array);
		for(int i=0;i<3;i++){
			System.out.println(array[i]);
		}

	}

}
