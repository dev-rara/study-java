package basic.operator;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 1;
		result += 10;
		System.out.println("result: " + result);    //result: 11

		result -= 5;
		System.out.println("result: " + result);    //result: 6

		result *= 3;
		System.out.println("result: " + result);    //result: 18

		result /=5;
		System.out.println("result: " + result);    //result: 3

		result %= 3;
		System.out.println("result: " + result);    //result: 0
	}

}
