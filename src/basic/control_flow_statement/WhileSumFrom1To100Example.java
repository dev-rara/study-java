package basic.control_flow_statement;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;

		int i = 1;

		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1~" + (i - 1) + " 합: "  + sum);    //1~100 합: 5050
	}

}
