package basic;

public class BasicHomework {

	public static void main(String[] args) {
		//Q1
		int var1 = 5;
		int var2 = 2;
		double var3 = var1 / var2;
		int var4 = (int) (var3 * var2);
		System.out.println(var4);

		int var5 = 5;
		int var6 = 2;
		double var7 = (double) var5 / var6;
//		double var7 =  var5 / (double) var6;
		int var8 = (int) (var7 * var6);
		System.out.println(var8);

		//Q2
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		System.out.println(y);

		//Q3
		System.out.println("시작!");
		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;

			if (num1 + num2 != 5) {
				System.out.printf("(%d, %d)\n", num1, num2);
			} else {
				System.out.printf("(%d, %d)\n", num1, num2);
				System.out.println("끝!");
				break;
			}
		}
	}
}
