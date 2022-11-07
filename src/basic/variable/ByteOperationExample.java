package basic.variable;

public class ByteOperationExample {

	public static void main(String[] args) {
		byte result = 10 + 20;
		System.out.println(result);    //30

		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);    //30 -> byte가 피연산자인 경우 int로 자동 타입 변환된다.
	}

}
