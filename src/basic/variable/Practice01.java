package basic.variable;

public class Practice01 {

	public static void main(String[] args) {
//      1. 자료형 - 숫자
		System.out.println("== 정수 ==");
//      1-1. 정수
		byte byteValue = 10;
		System.out.println("byteValue: " + byteValue);

		short shortValue = 20;
		System.out.println("shortValue: " + shortValue);

		char charValue = 'A';
		System.out.println("charValue: " + charValue);

		int intValue = 30;
		System.out.println("intValue: " + intValue);

		System.out.println("== 실수 ==");
//      1-2. 실수
		float floatValue = 3.14f;
		System.out.println("floatValue: " + floatValue);

		double doubleValue = 3.14;
		System.out.println("doubleValue: " + doubleValue);

		System.out.println("== 2진수/ 8진수/ 16진수==");
//      1-3. 2진수 / 8진수 / 16진수
		int numBase2 = 0b1100;
		int numBase8 = 014;
		int numBase16 = 0xC;
		System.out.println(numBase2);
		System.out.println(numBase8);
		System.out.println(numBase16);

		System.out.println("0b" + Integer.toBinaryString(numBase2));
		System.out.println("0" + Integer.toOctalString(numBase8));
		System.out.println("0x" + Integer.toHexString(numBase16));


//      2. 자료형 - 부울
		System.out.println("== 부울/불린 ==");
		boolean isPass = true;
		boolean isOk = false;
		System.out.println(isPass);
		System.out.println(isOk);


//      3. 자료형 - 문자
		System.out.println("== 문자 ==");
		char keyFirst = 'a';
		char keyLast = 'z';
		System.out.println(keyFirst);
		System.out.println(keyLast);
		System.out.println((int)keyFirst);
		System.out.println((int)keyLast);
	}
}
