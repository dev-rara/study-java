package basic.inheritance;

public class Child extends Parent {

	private String name;

	public Child() {
		this("김자바");
		System.out.println("Child() call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
