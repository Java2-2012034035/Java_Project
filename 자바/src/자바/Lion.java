package �ڹ�;

public class Lion extends Animal {
	private int legs;

	public Lion() {
		super(100, "leister"); // �θ� �θ��°�
		         // super���� ������? =�����ڰ� ������ 
		this.legs = 4;
	}

	void roar() {
		System.out.println("roarȣ��");
	}

	void infor() {
		System.out.println(weight + " " + picture);
	}
}
