import java.util.*;
class Circle
{
public double rad;
Scanner kb = new Scanner(System.in);
	public double setRadius(){
		this.rad = kb.nextFloat();
		return rad;
	}
	public double calculateArea(){
		double area = Math.PI*rad*rad;
		System.out.println("Area = "+area);
		return area;
	}
	public double calculateCircumference(){
		double cir = Math.PI*2*rad;
		System.out.println("Circumference = "+cir);
		return cir;
	}
}
class UseCircle
{
public static void main(String[] args){
	Circle abc = new Circle();
	abc.setRadius();
	abc.calculateArea();
	abc.calculateCircumference();
}
}