package function;

 class Overloading {
	static int add(int a,int b)
	{
		return a+b;
	}
	static double add(double a, double b)
	{
		return a+b;
	}
public class main{
	public static void main(String[] args) {
	Overloading loading = new Overloading();
		System.out.println(loading.add(10,20));
		System.out.println(loading.add(10.5,20.6));
	}
		
		
			 
	}

}
