package homework.transportation;

public class Taxi extends PublicTransportation {

	//초기 번호
	static int serialNum = 1;

	//고유 번호
	int number;

	//목적지
	String destination = "";

	//목적지까지의 거리
	int distance;

	//거리당 요금
	int feeByDistance = 1000;

	//지불해야할 요금
	int totalFee;

	//누적요금
	int profit;

	public Taxi() {
		this(false, 4, 3000);
		number = serialNum++;
	}

	public Taxi(boolean status, int maxPassenger, int fee) {
		super(status, maxPassenger, fee);
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
		setStatus();
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
		System.out.println("상태 = " + getStatus());
	}

	@Override
	public String getStatus() {
		if (this.status) {
			return "운행중";
		}
		return "일반";
	}

	@Override
	public void getFuelAndStatus() {
		System.out.println("주유량 = " + this.fuel);

		if (this.fuel == 0) {
			System.out.println("상태 = 운행 불가");
		} else {
			System.out.println("상태 = " + getStatus());
		}

		System.out.println("누적 요금 = " + this.profit);

		if (this.fuel < 10) {
			System.out.println("주유가 필요합니다.");
		}
	}

	public void pay() {
		profit += totalFee;
		setStatus();
		getOff(this.curPassenger);
	}
}
