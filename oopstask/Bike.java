package oopstask;
 class vehicle {
	void run()
	{
		System.out.println("running");
	}
}
class Bike extends vehicle
{
	void run()
	{
		System.out.println("running safely with 60km");
	}


	public static void main(String[] args) {
		
		vehicle v = new Bike();
		v.run();
		
		

	}
}

