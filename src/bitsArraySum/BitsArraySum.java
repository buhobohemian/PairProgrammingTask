package bitsArraySum;

public class BitsArraySum {
	public static int getBitsofNumber(int number) {
		return 42;
	}
	public static int[][] bitMatrixBuilding(int[] array){
		int[][] result= new int[2][array.length];
		
			for (int j = 0; j < result.length; j++) {  //for the first row
				result[0][j]=array[j];
			}
		
			for (int j = 0; j < result.length; j++) {  //for the second row
				result[1][j]=getBitsofNumber(array[j]);
			}
		return result;
	}
	public static int[] arrangeArray(int[][] matrix) {
		return null;
	}

}
