package oopsconcept;
//overriding method
class calc{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void multiply(int a, int b, int c)
	{
		System.out.println(a*b*c);
	}
}
public class Calculation {
	
	public static void main(String[] args) {
		calc c = new calc();
		c.add(4,5);
		c.multiply(4, 5, 6);

	}

}



