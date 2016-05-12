package ÀÚ¹Ù_abstract;

public class Rectangle extends Shape{
	
	//field¸¸µê
	private int x1, y1;
	
	public Rectangle(){
		x1 = 123; y1 =753;
	}
	
	public void move(int _x, int _y){
		x= x1+_x; y= y1+_y;
	}
	public void info(){System.out.println("R x: "+x+"y : "+y);}

}
