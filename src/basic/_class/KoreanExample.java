package basic._class;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("김자바", "012345-1234567");
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);

		Korean k2 = new Korean("이자바", "123456-2345678");
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.ssn: " + k2.ssn);
	}
}
