package �ڹ�_abstract;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �߻�Ŭ������ Rec�� Circle�� ��������ֱ����ؼ�
		Shape s1 = new Shape();

		Shape r1 = new Rectangle();
		Shape c1 = new Circle();
        //^^^ ��� ������.  
		s1.move(99, 99);
		r1.move(111, 111);
		c1.move(112, 112);
		//infor(r1);
        //infor(c1);
	}
	//static�� ��ü���� ������ ���ؼ�.
  // static void infor(Rectangle r){r.info();}
   //static void infor(Circle c){c.info();}


}
