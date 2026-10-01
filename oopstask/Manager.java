package oopstask;
class employeedata
{
	String name = "shameena";
	void display()
	{
		System.out.println("manager of this company");
	}
	
}
 class Manager extends employeedata
{
	 String name = "sowmiya";
	 void show()
	
	 {
		 System.out.println("Highest salary");
		 System.out.println(super.name);
		 super.display();
	 }


	public static void main(String[] args) {
		Manager m = new Manager();
		m.show();
	}

}
