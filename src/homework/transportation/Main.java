package homework.transportation;

public class Main {

	public static void main(String[] args) {
		System.out.println("========== Bus ==========");
		Bus bus1 = new Bus();
		Bus bus2 = new Bus();

		//각 Bus 고유번호 확인
		System.out.println(bus1.number);
		System.out.println(bus2.number);

		//승객 +2
		bus1.getOn(2);
		bus1.printInfo();
		bus1.getOff(2);

		//주유량 -50
		bus1.useFuel(50);
		bus1.getFuel();

		//상태변경, 주유량 +10
		bus1.setStatus();
		bus1.addFuel(10);
		bus1.getFuelAndStatus();

		// 승객 +45
		bus1.setStatus();
		bus1.getOn(45);

		//승객 +5
		bus1.getOn(5);
		bus1.printInfo();
		bus1.getOff(5);

		//주유량 -55
		bus1.useFuel(55);
		bus1.getFuelAndStatus();

		System.out.println("========== Taxi ==========");
		Taxi taxi1 = new Taxi();
		Taxi taxi2 = new Taxi();

		//각 Taxi 번호 확인
		System.out.println(taxi1.number);
		System.out.println(taxi2.number);

		//승객 +2, 목적지(서울역), 목적지까지 거리(2)
		taxi1.getInTaxi(2, "서울역", 2);
		taxi1.printInfo();

		//주유량 -80
		taxi1.useFuel(80);

		//요금 결제
		taxi1.pay();
		taxi1.getFuelAndStatus();

		//승객 +5
		taxi1.getOn(5);

		//승객 +3, 목적지(구로디지털단지역), 목적지까지 거리(12)
		taxi1.getInTaxi(3, "구로디지털단지역", 12);
		taxi1.printInfo();

		//주유량 -20
		taxi1.useFuel(20);

		//요금 결제
		taxi1.pay();
		taxi1.getFuelAndStatus();
	}

}
