package operatorswithlogic;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Sample_5 {

	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("Enter First Number: ");
	int a = s.nextInt();
	
	System.out.println("Enter Second Number:");
	int b = s.nextInt();
	
	System.out.println("Enter Third Number");
	int c = s.nextInt();
	
	if(a >= b && a >= c)
	{
		System.out.println("Largest Number is: " + a);
	}
	else if(b >= a && b >= c)
	{
		System.out.println("Largest Number is:" + b);
	}
	else
	{
		System.out.println("Largest Number is:" + c);
	}
	}

}
