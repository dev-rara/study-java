package basic.polymorphism;

// Java 프로그래밍 - 다형성

import java.util.Collections;

class Person {

	public void print() {
		System.out.println("Person.print");
	}
}

class Student extends Person {

	public void print() {
		System.out.println("Student.print");
	}

	public void print2() {
		System.out.println("Student.print2");
	}
}

class CollegeStudent extends Person {

	public void print() {
		System.out.println("CollegeStudent.print");
	}
}


public class Main {

	public static void main(String[] args) {

//      1. 다형성
		System.out.println("== 다형성 ==");
		Person p1 = new Person();
		Student s1 = new Student();

		Person p2 = new Student();          //다형성
//		Student s2 = new Person();          //부모의 객체를 자식타입으로 생성하는 건 안됨

		p1.print();
		s1.print();
		p2.print();     //Student.print -> 타입과 관계없이 Student 객체에 해당하는 print()가 실행됨
//		p2.print2();    //Student 객체라도, 부모타입이 알고 있는 print()만 실행 가능

		Person p3 = new CollegeStudent();
		p3.print();

//      2. 타입 변환
		System.out.println("== 타입 변환 ==");
		Person pp1 = null;
		Student ss1 = null;
		Person pp2 = new Person();
		Student ss2 = new Student();
		Person pp3 = new Student();     //업 캐스팅

		pp1 = pp2;
		pp1 = ss2;

		ss1 = ss2;
//		ss1 = pp2;
		ss1 = (Student) pp3;     //pp3가 업캐스팅 된 것이기 때문에 (Student)로 타입 변환 가능 -> 다운 캐스팅

//      3. instanceof
		System.out.println("== instanceof ==");
		Person pe1 = new Person();
		Student st1 = new Student();
		Person pe2 = new Student();
		Person pe3 = new CollegeStudent();

		System.out.println(pe1 instanceof Person);
		System.out.println(pe1 instanceof Student);

		System.out.println(st1 instanceof Student);
		System.out.println(st1 instanceof Person);

		System.out.println(pe2 instanceof Person);
		System.out.println(pe2 instanceof Student);

		System.out.println(pe3 instanceof CollegeStudent);
		System.out.println(pe3 instanceof Person);

		if (pe1 instanceof Student) {
			Student stu1 = (Student) pe1;
		}
	}
}

