package standard;

public class IntArrayArrayArray {
	public static void main(String[] args) {
		int[] intArray1 = {1,2,3};
		int[] intArray2 = {4,5,6};
		int[][] arrayArray = {intArray1,intArray2};
		
		int[] intArray3 = {7,8,9};
		int[] intArray4 = {10,11,12};
		int[][] arrayArray2 = {intArray3,intArray4};
		
		int[][][] arrayArrayArray = {arrayArray,arrayArray2};
		
		for(int[][] arrayarray : arrayArrayArray)
		{
			for(int[] array : arrayarray)
			{
				for(int item : array)
				{
				System.out.println(item);
				}
			}
		}
	}
}
