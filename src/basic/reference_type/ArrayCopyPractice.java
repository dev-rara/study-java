package basic.reference_type;

public class ArrayCopyPractice {

	public static void main(String[] args) {
		int[][] myArray1 = {{1, 3},{5, 7}};
		int[][] myArray2 = {{2, 4, 6}, {8, 10, 12}};

		for (int i = 0; i < myArray1.length; i++) {
			System.arraycopy(myArray1[i], 0, myArray2[i], 0, myArray1[i].length);
		}

		for(int i = 0; i < myArray2.length; i++) {
			for(int j = 0; j < myArray2[i].length; j++) {
				System.out.println("myArray2[" + i + "][" + j + "] = " + myArray2[i][j]);
			}
		}
	}

}
