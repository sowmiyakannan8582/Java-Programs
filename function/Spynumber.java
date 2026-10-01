package function;

import java.util.Scanner;

public class Spynumber {
	static void spy(int num)
	{
		int sum = 0;
		int product = 1;
		int a = num;
		while(a>0)
		{
			int digit = a  %10;
			sum = sum+digit;
			product = product * digit;
			a = a/10;
		}
		if(sum == product)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not Spy Number");
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int b = a.nextInt();
		spy(b);
		
	
		

	}

}
