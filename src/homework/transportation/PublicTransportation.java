package homework.transportation;

public abstract class PublicTransportation {
	//번호
	String number;

	//연료량
	int fuel = 100;

	//속도
	int speed = 0;

	//최대 승객 수
	int maxPassenger;

	//현재 승객 수
	int curPassenger;

	//기본 요금
	int fee;

	//상태
	boolean state = true;

	public PublicTransportation(String number, boolean state, int maxPassenger, int fee) {
		this.number = number;
		this.state = state;
		this.maxPassenger = maxPassenger;
		this.fee = fee;
	}

	public void getOn(int passenger) {
		if (this.curPassenger + passenger > this.maxPassenger) {
			System.out.println("최대 승객 수 초과");
			return;
		}
		this.curPassenger += passenger;
	}

	public void getOff(int passenger) {
		if (this.curPassenger <= 0) {
			System.out.println("탑승 승객이 없습니다.");
			return;
		}
		this.curPassenger -= passenger;
	}

	public void plusSpeed(int speed) {
		this.speed += speed;
	}

	public void minusSpeed(int speed) {
		this.speed -= speed;
	}

	public void setState() {
		this.state = !this.state;
	}

	public void getFuel() {
		System.out.println("주유량: " + this.fuel);
	}

	public void addFuel(int amount) {
		this.fuel += amount;
	}

	public void useFuel(int amount) {
		if (this.fuel < 10) {
			System.out.println("주유가 필요합니다.");
		}

		this.fuel -= amount;
	}

	abstract public void printInfo();
	abstract public String getState();
	abstract public void getFuelAndState();
}
