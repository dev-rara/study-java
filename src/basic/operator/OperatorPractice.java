package basic.operator;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {
		//Q1
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 수: ");
		double inputData1 = scanner.nextDouble();
//		double inputData1 = Double.parseDouble(scanner.nextLine());

		System.out.print("두 번째 수: ");
		double inputData2 = scanner.nextDouble();
//		double inputData2 = Double.parseDouble(scanner.nextLine());

		System.out.println("---------------");

		if (inputData2 == 0 || inputData2 == 0.0) {
			System.out.println("결과: 무한대");
		} else {
			System.out.println("결과: " + (inputData1 / inputData2));
		}


		//Q2
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println("원의 넓이: " + var4);

		//Q3
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디: ");
		String name = sc.nextLine();

		System.out.print("패스워드: ");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);

		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패: 아이디 존재하지 않음");
		}
	}

}
