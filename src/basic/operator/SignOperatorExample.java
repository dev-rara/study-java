package basic.operator;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1: " + result1);    //result1: -100
		System.out.println("result2: " + result2);    //result3: 100

		byte b = 100;
//		byte result3 = -b;      byte타입의 연산결과는 int타입,컴파일 에러 방생
		int result3 = -b;
		System.out.println("result3: " + result3);    //result3: -100
	}
}
