package 자바;

public class Eagle extends Animal {
	private int wings = 2;

	public Eagle() {
		System.out.println("Eagle 묵시적");
	}

	void fly() {
		System.out.println("fly");
	}

	void eat() {
		System.out.println("zzoda");
	}
}