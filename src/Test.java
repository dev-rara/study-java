public class Test {

	public static void main(String[] args) {
		int[][] b = new int[2][];
		b[0] = new int[2];
		b[1] = new int[3];
		b[0][0] = 5;
		b[1][1] = 7;
		b[1][2] = 10;
		for(int i = 0; i < b.length; i++) {
			for(int k = 0; k < b[i].length; k++) {
				System.out.println("b[" + i + "][" + k + "] = " + b[i][k]);
			}
		}

		System.out.println("------------------------------");

		int[][] c = new int[2][];
		c[0] = new int[3];
		c[1] = new int[4];
		c[1][3] = 111;
		for(int i = 0; i < c.length; i++) {
			for(int k = 0; k < c[i].length; k++) {
				System.out.println("c[" + i + "][" + k + "] = " + c[i][k]);
			}
		}

		System.out.println("------------------------------");

		for (int i = 0; i < b.length; i++) {
			System.arraycopy(b[i], 0, c[i], 0, b[i].length);
		}

		for(int i = 0; i < c.length; i++) {
			for(int k = 0; k < c[i].length; k++) {
				System.out.println("c[" + i + "][" + k + "] = " + c[i][k]);
			}
		}
	}

}
