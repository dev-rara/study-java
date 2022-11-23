package basic._class;

class Calculation {
	int add(int x, int y) {
		return x + y;
	}

	int subtract(int x, int y) {
		return x - y;
	}
}

public class Main {
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		int addResult = cal.add(1, 2);
		int subtractResult = cal.subtract(5, 3);

		System.out.println(addResult);
		System.out.println(subtractResult);
	}
}