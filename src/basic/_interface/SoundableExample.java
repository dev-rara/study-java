package basic._interface;

public class SoundableExample {
	private static void printSoung(Soundable soundable) {
		System.out.println(soundable.sound());
	}


	public static void main(String[] args) {
		printSoung(new Cat());
		printSoung(new Dog());
	}
}
