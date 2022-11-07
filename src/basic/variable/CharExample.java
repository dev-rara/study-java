package basic.variable;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';    // 16진수로 저장

		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';    // 16진수로 저장

		System.out.println(c1);   // A
		System.out.println(c2);   // A
		System.out.println(c3);   // A
		System.out.println(c4);   // 가
		System.out.println(c5);   // 가
		System.out.println(c6);   // 가
	}

}
