package �ڹ�;

public class Animal {
	protected double weight;
	protected String picture;

	public Animal() {
		weight = 99;
		picture = "Sweet";
		System.out.println("Animal asfsad");
	}
	public Animal(double weight, String picture){
		
		this.weight = weight;
		this.picture = picture;
		System.out.println("Animal asfsad2");
	}

	void eat() {
		System.out.println("eatȣ��");
	}

	void sleep() {
		System.out.println("sleepȣ��");
	}
}
