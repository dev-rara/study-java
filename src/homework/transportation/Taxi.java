package homework.transportation;

import java.util.UUID;

public class Taxi extends PublicTransportation {

	//목적지
	String destination = "";

	//목적지까지의 거리
	int distance;

	//거리당 요금
	int feeByDistance = 1000;

	//누적요금
	int totalFee;

	//매상
	int money;


	public Taxi() {
		this(UUID.randomUUID().toString(), false, 4, 3000);
	}

	public Taxi(String number, boolean state, int maxPassenger, int fee) {
		super(number, state, maxPassenger, fee);
	}

	@Override
	public void printInfo() {
		totalFee = this.fee + ((this.distance - 1) * this.feeByDistance);

		System.out.println("탑승 승객 수 = " + curPassenger);
		System.out.println("잔여 승객 수 = " + (maxPassenger - curPassenger));
		System.out.println("기본요금 확인 = " + this.fee);
		System.out.println("목적지 = " + this.destination);
		System.out.println("목적지까지 거리 = " + distance + "Km");
		System.out.println("지불할 요금 = " + totalFee);
		System.out.println("상태 = " + getState());
	}


	public void getInTaxi(int passenger, String destination, int distance) {
		if (this.fuel < 10) {
			System.out.println("주유가 필요합니다.");
			return;
		}

		if (this.curPassenger + passenger > this.maxPassenger) {
			System.out.println("최대 승객 수 초과");
			return;
		}

		this.curPassenger += passenger;
		this.destination = destination;
		this.distance = distance;
		setState();
	}

	@Override
	public String getState() {
		if (this.state) {
			return "운행중";
		}
		return "일반";
	}

	@Override
	public void getFuelAndState() {
		System.out.println("주유량 = " + this.fuel);

		if (this.fuel == 0) {
			System.out.println("상태 = 운행 불가");
		} else {
			System.out.println("상태 = " + getState());
		}

		System.out.println("누적 요금 = " + this.money);

		if (this.fuel < 10) {
			System.out.println("주유가 필요합니다.");
		}
	}

	public void pay() {
		money += totalFee;
		setState();
		getOff(this.curPassenger);
	}
}
