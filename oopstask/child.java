package oopstask;

 class Animal
	{
	void dog()
	{
		System.out.println("dog");
	}
	}
public	class child extends Animal
	{
		void protecting()
		{
			System.out.println("protecting");
		}
	
	

	public static void main(String[] args) {
		child c= new child();
		c.dog();
		c.protecting();
	}
	}


