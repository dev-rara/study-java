package basic.reference_type;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		//Q1
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};

		for(int num: array) {
			if(max <= num) {
				max = num;
			}
		}
		System.out.println("max: " + max);    //max: 8


		//Q2
		int[][] myArray = {{95, 86},{83, 92, 96},{78, 83, 93, 87, 88}};
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;

		for (int i = 0; i < myArray.length; i++) {
			for (int j = 0; j < myArray[i].length; j++) {
				sum += myArray[i][j];
				cnt++;
			}
		}
		avg = (double)sum / cnt;

		System.out.println("sum: " + sum);    //sum: 881
		System.out.println("avg: " + avg);    //avg: 88.1


		//Q3
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수 입력 | 3.점수 리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if(selectNo == 4) {
				int maxNum = 0;
				int total = 0;
				double average = 0;

				for (int score: scores) {
					total += score;
					if (maxNum <= score) {
						maxNum = score;
					}
				}
				average = (double)total / studentNum;

				System.out.println("최고 점수: " + maxNum);
				System.out.println("평균 점수: " + average);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
