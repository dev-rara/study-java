package basic._class;

public class Car {
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	final static int maxSpeed = 350;
	private int speed;

	private boolean stop;

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
