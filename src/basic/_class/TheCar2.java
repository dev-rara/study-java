package basic._class;

public class TheCar2 {

	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;

	TheCar2() {
	}

	TheCar2(String model) {
		this(model, "은색", 250);
	}

	TheCar2(String model, String color) {
		this(model, color, 250);
	}

	TheCar2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
