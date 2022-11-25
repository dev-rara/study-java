package homework.transportation;

import java.util.UUID;

public class Bus extends PublicTransportation {

	public Bus() {
		this(UUID.randomUUID().toString(), true, 30, 1000);
	}

	public Bus(String uuid, boolean state, int maxPassenger, int fee) {
		super(uuid, state, maxPassenger, fee);
	}

	@Override
	public void printInfo() {
		System.out.println("탑승 승객 수 = " + curPassenger);
		System.out.println("잔여 승객 수 = " + (maxPassenger - curPassenger));
		System.out.println("요금 확인 = " + this.fee * curPassenger);
	}

	@Override
	public String getState() {
		if (this.state) {
			return "운행중";
		}
		return "차고지행";
	}

	@Override
	public void getFuelAndState() {
		System.out.println("주유량 = " + this.fuel);
		System.out.println("상태 = " + getState());

		if (this.fuel < 10) {
			System.out.println("주유가 필요합니다.");
		}
	}

	@Override
	public void useFuel(int amount) {
		this.fuel -= amount;

		if (this.fuel < 10) {
			this.state = false;
		}
	}
}
