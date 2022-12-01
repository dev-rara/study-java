package basic.inheritance;

public class Child2Example {

	public static void main(String[] args) {
		Child2 child = new Child2();

		Parent2 parent = child;
		parent.method1();
		parent.method2();
//		parent.method3();      //호출 불가능

	}

}
