package basic._class;

class MyCar {

	String name;
	String type;

	MyCar(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public void printCarInfo() {
		System.out.println("=== Car Info ===");
		System.out.println("name: " + name);
		System.out.println("type: " + type);
	}

	// 오버로딩 구현
	public void printCarInfo(String date) {
		this.printCarInfo();
		System.out.println("date: " + date);
	}

	public void printCarInfo(int number) {
		this.printCarInfo();
		System.out.println("number: " + number);
	}

	public void printCarInfo(String date, int number) {
		this.printCarInfo();
		System.out.println("date: " + date);
		System.out.println("number: " + number);
	}

}


class Car3 {

	// 스태틱 변수
	static String name = "None";
	String type;

	Car3(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public void printCarInfo() {
		System.out.println("=== MyCar Info ===");
		System.out.println("name: " + name);
		System.out.println("type: " + type);
	}

	// 스태틱 메소드
	public static void getName() {
		System.out.println("Car name: " + name);
	}
}


public class Practice03 {

	public static void main(String[] args) {
		MyCar myCar1 = new MyCar("a", "sedan");
		myCar1.printCarInfo();

//      1. 오버로딩 사용
		System.out.println("=== 오버로딩 사용 ===");
		myCar1.printCarInfo("2022");
		myCar1.printCarInfo(1234);
		myCar1.printCarInfo("2022", 1234);

//      2. Static
		System.out.println("=== Static ===");
		Car3.getName();

		Car3 myCar3_1 = new Car3("a", "sedan");
		Car3 myCar3_2 = new Car3("b", "suv");
		Car3 myCar3_3 = new Car3("c", "rv");
		myCar3_1.printCarInfo();
		myCar3_2.printCarInfo();
		myCar3_3.printCarInfo();
	}
}
