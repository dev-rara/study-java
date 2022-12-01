package basic.inheritance;

public class SportCar extends MyCar {

	@Override
	public void speedUp() {
		speed += 10;
	}

//	@Override
//	public void stop() {                   //메소드 재정의 불가
//		System.out.println("스포츠카 정지");
//		speed = 0;
//	}
}
