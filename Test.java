import java.util.Scanner;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double rad, cir, area;
		System.out.println("Enter Radius=");
		rad = sc.nextInt();
		cir = Math.PI*rad*2;
		area = Math.PI*Math.pow(rad,2);
		
		System.out.println("Circumference =" +cir);
		System.out.println("Area =" +area);
	}
}