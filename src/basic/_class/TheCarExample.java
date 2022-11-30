package basic._class;

public class TheCarExample {

	public static void main(String[] args) {
		TheCar car1 = new TheCar();
		System.out.println("car1.company: " + car1.company);
		System.out.println();

		TheCar car2 = new TheCar("자가용");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();

		TheCar car3 = new TheCar("자가용", "Red");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println();

		TheCar car4 = new TheCar("자가용", "Red", 250);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
	}
}
