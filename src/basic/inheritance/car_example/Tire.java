package basic.inheritance.car_example;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulatedRotation;

		if(accumulatedRotation < maxRotation) {   //정상 회전일 경우 실행
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {    //타이어 펑크일 경우 실행
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}
