package oopstask;
class calci
{
 void add(int a, int b)
	{
		System.out.println(a+b);
	}
 void sub(int a,int b)
 	{
	 System.out.println(a-b);
 	}
 void mul(int a,int b,int c)
 {
	 System.out.println(a*b*c);
 }
 
}
public class Calculator {
	public static void main(String[] args) {
		calci c = new calci();
		c.add(40, 50);
		c.sub(8, 5);
		c.mul(5, 2, 7);

	}

}
