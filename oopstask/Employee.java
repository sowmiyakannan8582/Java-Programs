package oopstask;

abstract class employee
{
	abstract void salary();
}
class staff extends employee
{
	void salary()
	{
		System.out.println("25000");
	}



	

	public static void main(String[] args) {
		
		employee s = new staff();
		s.salary();
		

	}

}
