class Student
{
	int rno;
	String name;
	String grade;

	Student(int rno, String name, String grade){
		this.rno = rno;
		this.name = name;
		this.grade = grade;
	}

	public void getData(){
		System.out.println("Roll No: "+rno);
		System.out.println("Name: "+name);
		System.out.println("Grade: "+grade);
	}
}

class Getstudent{
public static void main(String[] args){
	Student x = new Student(25, "Shub", "A");
	x.getData();
	Student y = new Student(26, "haha", "F");
	y.getData();
}
}