package homework.transportation;

public class Bus extends PublicTransportation {

	//초기 번호
	static int serialNum = 1;

	//고유 번호
	int number;

	public Bus() {
		this(true, 30, 1000);
		number = serialNum++;
	}

	public Bus(boolean state, int maxPassenger, int fee) {
		super(state, maxPassenger, fee);
	}

	@Override
	public void printInfo() {
		System.out.println("탑승 승객 수 = " + curPassenger);
		System.out.println("잔여 승객 수 = " + (maxPassenger - curPassenger));
		System.out.println("요금 확인 = " + this.fee * curPassenger);
	}

	@Override
	public String getStatus() {
		if (this.status) {
			return "운행중";
		}
		return "차고지행";
	}

	@Override
	public void getFuelAndStatus() {
		System.out.println("주유량 = " + this.fuel);
		System.out.println("상태 = " + getStatus());

		if (this.fuel < 10) {
			System.out.println("주유가 필요합니다.");
		}
	}

	@Override
	public void useFuel(int amount) {
		this.fuel -= amount;

		if (this.fuel < 10) {
			this.status = false;
		}
	}
}
