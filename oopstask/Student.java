package oopstask;

public class Student {
	String name = "abi";
	int age = 21;
	int marks = 70;
	void display()
	{
		System.out.println(name +" "+ age +" "+marks );
		
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.display();

	}

}
