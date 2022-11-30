package basic._class;

public class Calculator2Example {

	public static void main(String[] args) {
		Calculator2 myCalc = new Calculator2();
		myCalc.powerOn();

		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);   //11

		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);   //2.5

		myCalc.powerOff();
	}
}
