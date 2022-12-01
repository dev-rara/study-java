package basic.inheritance;

// Java 프로그래밍 - 상속

class Person {

	String name;
	int age;
	public int a1;
	private int a2;

	Person() {}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void printInfo() {
		System.out.println("Person.printInfo");
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}
}

// Student 클래스 - Person 상속, 접근제어자 확인
class Student1 extends Person {
	Student1() {
		a1 = 1;   //public 이므로 사용가능
//		a2 = 1;   //private 이므로 사용 불가능
	}
}

// Student 클래스 - Person 상속, super 사용, 오버라이딩
class Student2 extends Person {
	String name;
	int stdId;

	Student2(String name, int age, int stdId) {
		this.name = name;      //자기 객체에 name을 할당
//		super.name = name;     //입력받은 name을 부모클래스의 name으로 할당
//		super(name, age);      //부모객체 쪽으로 name, age 할당

		this.age = age;        //상속받은 age
		this.stdId = stdId;
	}

	//오버라이딩 메소드
	public void printInfo() {
		System.out.println("Student2.printInfo");
		System.out.println("name: " + name);        //여기서의 name은 기본적으로 자기객체의 name을 가져다 쓰고 있다.
		System.out.println("age: " + age);
		System.out.println("stdId: " + stdId);
	}

}


public class Main {

	public static void main(String[] args) {

//      Test code
//      1. 상속
		System.out.println("=============");
        Student1 s1 = new Student1();
        s1.name = "a";
        s1.age = 25;
        s1.printInfo();

//      2. super, super(), 오버라이딩
		System.out.println("=============");
        Student2 s2 = new Student2("b",32, 1);
        s2.printInfo();

	}
}

