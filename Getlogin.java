import java.util.*;
class Loginpage{
	public void getage(int age){
		if(age<=18){
			throw new IllegalArgumentException("You re under age of 18");
		}else{
			System.out.println("Age is: "+age);
		}
	}
}

class Getlogin{
	public static void main(String[] args){
		Loginpage l = new Loginpage();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Age: ");
		int age1 = sc.nextInt();
		
		try{
			l.getage(age1);
		}catch(IllegalArgumentException e){
			System.out.println("Exception: "+e.getMessage());
		}
	}
}