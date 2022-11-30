package basic._class;

public class TheCar {
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;

	//생성자1
	TheCar() {}

	//생성자2
	TheCar(String model) {
		this.model = model;
	}

	//생성자3
	TheCar(String model, String color) {
		this.model = model;
		this.color = color;
	}

	//생성자4
	TheCar(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
