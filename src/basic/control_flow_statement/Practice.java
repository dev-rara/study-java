package basic.control_flow_statement;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		//Q1
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합: " + sum);

		//Q2
		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");

			if ((num1 + num2) == 5) {
				break;
			}
		}

		//Q3
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				if((4 * x) + (5 * y) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}

		//Q4
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//Q5
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j > 0; j--) {
				if(i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		//Q6(if문)
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			int number = scanner.nextInt();

			if(number == 1) {
				System.out.print("예금액> ");
				balance += scanner.nextInt();
			} else if (number == 2) {
				System.out.print("출금액> ");
				balance -= scanner.nextInt();
			} else if (number == 3) {
				System.out.print("잔고> ");
				System.out.println(balance);
			} else if (number == 4) {
				run = false;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");


		//Q6(switch)
		boolean isOK = true;
		int balance2 = 0;
		Scanner sc = new Scanner(System.in);

		while (isOK) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");

			int menu = sc.nextInt();

			switch (menu) {
				case 1:
					System.out.print("예금액> ");
					balance2 += sc.nextInt();
					break;
				case 2:
					System.out.print("출금액> ");
					balance2 -= sc.nextInt();
					break;
				case 3:
					System.out.print("잔고> ");
					System.out.println(balance2);
					break;
				case 4:
					isOK = false;
					break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
