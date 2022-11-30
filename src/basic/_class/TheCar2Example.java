package basic._class;

public class TheCar2Example {

	public static void main(String[] args) {
		TheCar2 car1 = new TheCar2();
		System.out.println("car1.company: " + car1.company);
		System.out.println();

		TheCar2 car2 = new TheCar2("자가용");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();

		TheCar2 car3 = new TheCar2("자가용", "Red");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println();

		TheCar2 car4 = new TheCar2("택시", "Black", 250);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
	}
}
