import java.util.*;
class Bs
{
	Scanner kb = new Scanner(System.in);
	public double rad = kb.nextDouble();
	
	public double circ(){
		System.out.println("Circumference: "+2*rad*Math.PI);
		return 0.0;
	}
	
	public double area(){
		System.out.println("Area: "+Math.PI*Math.pow(rad,2));
		return 0.0;
	}
}
class Getbs
{
	public static void main(String[] args){
		Bs a = new Bs();
		a.circ();
		a.area();
	}
}