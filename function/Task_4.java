package function;

public class Task_4 {
	public static int armstrong(int n)
	{
		int b = n;
		int sum = 0;
		while (n>0)
		{
			int c = n%10;
			sum = sum + (c*c*c);
			n = n/10;
		}
		if(sum == b)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(armstrong(153));

	}

}
