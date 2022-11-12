package basic.reference_type;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];

		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];             //old -> new 배열 복사
		}

		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + " ");      //1 2 3 0 0
		}
	}

}
