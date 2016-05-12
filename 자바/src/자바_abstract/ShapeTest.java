package 자바_abstract;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상클래스는 Rec과 Circle을 연결시켜주기위해서
		Shape s1 = new Shape();

		Shape r1 = new Rectangle();
		Shape c1 = new Circle();
        //^^^ 요게 다형성.  
		s1.move(99, 99);
		r1.move(111, 111);
		c1.move(112, 112);
		//infor(r1);
        //infor(c1);
	}
	//static은 객체없이 돌리기 위해서.
  // static void infor(Rectangle r){r.info();}
   //static void infor(Circle c){c.info();}


}
