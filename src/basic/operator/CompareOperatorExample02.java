package basic.operator;

public class CompareOperatorExample02 {

	public static void main(String[] args) {
		int v1 = 1;
		double v2 = 1.0;
		System.out.println(v1 == v2);           //true

		double v3 = 0.1;
		float v4 = 0.1f;
		System.out.println(v3 == v4);           //false
		System.out.println((float)v3 == v4);    //true
	}
}
