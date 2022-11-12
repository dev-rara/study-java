package basic.reference_type;

public class ArrayCreateByValueListExample01 {

	public static void main(String[] args) {
		int[] scores = {83,90, 87};

		System.out.println("scores[0]: " + scores[0]);   //scores[0]: 83
		System.out.println("scores[1]: " + scores[1]);   //scores[1]: 90
		System.out.println("scores[2]: " + scores[2]);   //scores[2]: 87

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);    //총합: 260

		double avg = (double)sum / 3;
		System.out.println("평균: " + avg);    //평균: 86.66666666666667
	}
}
