package oopsconcept;
//overriding
public class Car {
	String make; 
	String model ;
	int year;
	
	public static void main(String[] args) {
		Car c = new Car();
		c.make = "production";
		c.model = "toyoto";
		c.year = 2;
		System.out.println(c.make);
		System.out.println(c.model);
		System.out.println(c.year);

		

	}

}
