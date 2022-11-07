package basic.variable;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);     // x: 3, y: 5

		int temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y: " + y);    // x: 5, y: 3
	}

}
