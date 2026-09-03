package laddertask;
import java.util.Scanner;
public class Task_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/*System.out.println("Enter value: ");
		int a = s.nextInt();
		if(a<0)
		{
			System.out.println("positive");
		}
		else if(a == 0)
		{
			System.out.println("zero");
		}
		else
		{
			System.out.println("negative");
		}*/
		
		//task 42
		/*System.out.println("Enter Number a :");
		int a = s.nextInt();
		System.out.println("Enter Number b :");
		int b = s.nextInt();
		System.out.println("Enter Number c :");
		int c = s.nextInt();
		if(a > b && a > c)
		{
			System.out.println("a is Largest");
		}
		else if(b > a && b > c )
		{
			System.out.println("b is Largest");
		}
		else
		{
			System.out.println("c is Largest");
		}*/
		
		//task 43
		System.out.println("Enter Grade");
		int mark = s.nextInt();
		if(mark >= 90)
		{
			System.out.println("A");
		}
		else if(mark >= 80)
		{
			System.out.println("B");
		}
		else if(mark >= 70)
		{
			System.out.println("C");
		}
		else if(mark >= 60)
		{
			System.out.println("D");
		}
		else if(mark >= 40)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("Below 40");
		}
	}

}
