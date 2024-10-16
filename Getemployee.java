class Employee
{
	static int id = 0;
	String name;
	int age;

	Employee(String name, int age){
		this.name = name;
		this.age = age;
		Employee.id++;
	}
	
	public void Show(){
		System.out.println("Employee ID:"+Employee.id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}

	public void showNextId(){
		int nextId = id+1;
		System.out.println("next Employee ID: "+nextId);
	}
	
}

class Getemployee
{
	public static void main(String[] args){
		Employee x = new Employee("Shub", 19);
		x.Show();
		x.showNextId();
		Employee y = new Employee("hello", 100);
		y.Show();
		y.showNextId();
	}
}