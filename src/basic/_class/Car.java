package basic._class;

public class Car {
	String company;
	String model;
	String color;

	int cc;
	final static int maxSpeed = 350;
	private int speed;

	private boolean stop;

	public Car() {}

	public Car(String color, int cc) {
		this.color = color;
		this.cc = cc;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
