package basic._class;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();

		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고속도: " + Car.maxSpeed);
		System.out.println("현재속도: " + myCar.getSpeed());

		myCar.setSpeed(60);
		System.out.println("수정된 속도: " + myCar.getSpeed());

		System.out.println("======== getter & setter ========");
		Car car = new Car();

		//잘못된 속도 변경
		car.setSpeed(-50);
		System.out.println("현재속도: " + car.getSpeed());

		//올바른 속도 변경
		car.setSpeed(60);
		System.out.println("현재속도: " + car.getSpeed());

		//멈춤
		if(!car.isStop()) {
			car.setStop(true);
		}
		System.out.println("현재속도: " + car.getSpeed());
	}

}
