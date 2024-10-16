import java.util.*;
class Worker
{
	public int hw;
	public double payRate;
	Scanner kb = new Scanner(System.in);

	public void setData(){
		System.out.println("Enter WorkHours: ");
		this.hw = kb.nextInt();
		System.out.println("Enter PayRate: ");
		this.payRate = kb.nextDouble();
	}

	public void calculateSalary(){
		if (hw >= 40){
			System.out.println("Wage = " +hw*payRate*2);
		}else{
			System.out.println("Wage = " +hw*payRate);
		}
		
	}
}

class UseWorker
{
	public static void main (String[] args)
	{
		Worker abc = new Worker();
		abc.setData();
		abc.calculateSalary();
	}
}
	
	