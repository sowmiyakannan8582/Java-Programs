package function;

public class Task_3 {
	public static void splitdigits(int a)
	{
		while(a>0)
		{
			int d = a % 10;
			System.out.println(d + " ");
			a =a/10;
		}
	}


	
	public static void main(String[] args) {
		splitdigits(4327);

	

}
	}