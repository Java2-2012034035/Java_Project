package 자바;

public class Lion extends Animal {
	private int legs;

	public Lion() {
		super(100, "leister"); // 부모껄 부르는거
		         // super쓰는 이유는? =생성자가 여러개 
		this.legs = 4;
	}

	void roar() {
		System.out.println("roar호출");
	}

	void infor() {
		System.out.println(weight + " " + picture);
	}
}
