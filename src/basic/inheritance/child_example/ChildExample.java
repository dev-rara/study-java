package basic.inheritance.child_example;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();    //자동 타입 변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		/*
		부모 타입으로 자동 타입 변환 되어 불가능!
		parent.field2 = "data2";
		parent.method3();
		*/

		Child child = (Child) parent;   //강제 타입 변환
		child.field2 = "yyy";
		child.method3();
	}
}
