package loopstatement;
import java.util.Scanner;
public class Looptask_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum of intergers
//		int sum = 0;
//		for(int i=1; i<=10; i++)//increment
//		//for(int i=10; i>=1; i--)//decrement
//		{
//			sum = sum+i;
//		{
//			System.out.println(sum);
//		}
//		
//	}
		//even or odd
//		int sum = 0;
//		for(int i=1; i<=10; i++)
//		{
//			if(i%2==0)
//			{
//				System.out.println("Even");
//			}
//			else
//			{
//				System.out.println("Odd");
//			}
//			sum=sum+i;
//			System.out.println(sum);
		//}
		
		//factorial
//		for(int i=1; i<=10; i++)
//		{
//			System.out.println(i+"x"+i+"="+i*i);
//		}
		
//		int fact = 1;
//		for(int i=1; i<=5; i++)
//		{
//			fact = fact*i;
//			{
//				System.out.println(fact);
//			}
//		}
		
		//alphabets
//		for(char i='a'; i<='z'; i++)
//		{
//			System.out.print(i);
//		}
		
		//reverse alphabets
//		for(char i='z'; i>='a'; i--)
//		{
//			System.out.print(i);
//		}
		
		
		//ascii values
//		for(char i='A'; i<='Z'; i++)
//		{
//			System.out.println(i + "=" + (int)i);
//		}
//		Scanner s = new Scanner(System.in);
		
//		int a = s.nextInt();
//		int sum = 0;
//		for(int i=1; i<=a; i++)
//		{
//			if(a % i == 0)
//			
//				sum = sum + i;
//			
//			System.out.println(sum);
//		}
		
		//palindrome
//		System.out.println("Enter a Value: ");
//		int a = s.nextInt();
//		int x = a;
//		int y = 0;
//		while(x > 0)
//		{
//			int b = x% 10;
//			y = y*10+b;
//			x = x/ 10;
//		}
//		if(a == y)
//		{
//			System.out.println("It is Palindrome");
//		}
//		else
//		{
//			System.out.println("Not Palindrome");
//		}
		
		//armstrong
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = a;
		int sum = 0;
		while(a > 0)
		{
			int c = a% 10;
			sum = sum + (c*c*c);
			a = a/ 10;
		}
		if(sum == b)
		{
			System.out.println("Armstrong number");
			
					
		}
		else
		{
			System.out.println("Not Armstrong");
		}

	}
}
