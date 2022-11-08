package basic.operator;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 95;
		char grade = (score > 90) ? 'A' : 'B';

		System.out.println(score + "점은 " + grade + "등급입니다.");    //95점은 A등급입니다.
	}

}
