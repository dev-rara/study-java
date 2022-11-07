package basic.variable;

public class FloatDoubleExample {

	public static void main(String[] args) {
//		float var1 = 3.15;    컴파일 에러 발생
		float var2 = 3.14f;
		double var3 = 3.14;

		float var4 = 0.12345567890123456789f;
		double var5 = 0.12345567890123456789;

		System.out.println("var2: " + var2);    // 3.14
		System.out.println("var3: " + var3);    // 3.14
		System.out.println("var4: " + var4);    //0.12345679
		System.out.println("var5: " + var5);    //0.12345678901234568

		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;

		System.out.println("var6: " + var6);   // 3000000.0
		System.out.println("var7: " + var7);   // 3000000.0
		System.out.println("var8: " + var8);   // 0.002
	}

}
