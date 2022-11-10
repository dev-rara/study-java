package basic.control_flow_statement;

public class ForSumFrom1To100Example02 {

	public static void main(String[] args) {
		int sum = 0;

		int i = 0;
		for(i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println("1~" + (i - 1) + " 합: " + sum);    //1~100 합: 5050, 증감식으로 인해 i = 101
	}

}
