package function;

import java.util.Scanner;

public class Splitdigits {
	static void demo(int a)
	{
		while(a>0)
		{
			int n = a % 10;
			System.out.println(n * n);
			a = a / 10;
			
		}
	} 
	public static void main ( String [] args)
	{
		Scanner a = new Scanner (System.in);
		System.out.println("Enter value:");
		int n = a.nextInt();
		Splitdigits d = new Splitdigits();
		d.demo(n);
		
		
		
	}
	}


