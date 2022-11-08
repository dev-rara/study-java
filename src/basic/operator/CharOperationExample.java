package basic.operator;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
//		char c3 = c2 + 1;    연산결과는 int 타입, 컴파일 에러 발생
		char c3 = (char)(c2 + 1);
		int c4 = c2 + 1;

		System.out.println("c1: " + c1);    //c1: B
		System.out.println("c2: " + c2);    //c2: A
		System.out.println("c3: " + c3);    //c3: B
		System.out.println("c4: " + c4);    //c4: 66
	}

}
