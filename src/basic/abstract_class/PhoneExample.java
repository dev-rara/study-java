package basic.abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone();    //추상 클래스이므로 생성자를 통한 객체 생성 불가

		SmartPhone smartPhone = new SmartPhone("김자바");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
