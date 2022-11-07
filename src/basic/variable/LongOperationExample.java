package basic.variable;

public class LongOperationExample {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);   //1110  -> 피연산자 중 허용범위가 가장 큰 long타입으로 변환되어 연산 수행
	}

}
