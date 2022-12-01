package basic.inheritance;

public class Child2 extends Parent2 {

	@Override
	public void method2() {    //재정의
		System.out.println("Child-method2()");
	}

	public void method3() {
		System.out.println("Child-method3()");
	}
}
