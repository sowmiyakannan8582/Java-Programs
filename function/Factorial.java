package function;

public class Factorial {
//	static void facto(int n)
//	{
//		int fact = 1;
//		for(int i=1; i<=n; i++)
//		{
//			fact = fact * i;
//			System.out.println(fact);
//		}
		
		
//	}
//
//	public static void main(String[] args) {
//		
//		facto(6);
	
	static int prime(int n)
	{

		int count =0;
		for(int i=1; i<=n; i++)
		{
		if(n % i == 0)
		{
			count++;
		}
		if(count == 2)
		{
			System.out.println(i+"Prime Number");
		}
		else
		{
			System.out.println(i+"Not Prime Number");
		}
		
		}
		return n;
		}
		
		public static void main(String [] args)
		{
			prime(4);
		}
	}

	

