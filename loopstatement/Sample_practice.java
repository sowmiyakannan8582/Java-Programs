package loopstatement;
import java.util.Scanner;
public class Sample_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for loop(increment)
		//Scanner s = new Scanner(System.in);
		/*for(int i=1; i<=5; i++)
		{
			System.out.println(i);
		}*/
		
		
		//infinity
		/*for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}*/
		
		//for loop decrement
		/*for(int i=5; i>=1; i--)
		{
			System.out.println(i);
		}*/
		
		//while loop increment
		/*int i=1;
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}*/
		
		//decrement
		/*int i=5;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}*/
			
		//infinity
		/*int i=5;
		while(i>=1)
		{
			System.out.println(i);
		}*/
		
		//do while loop increment
		/*int i=1;
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<=5);*/
		
		//decrement
		/*int i=5;
		do
		{
			System.out.println(i);
			i--;
		}
		while(i>=1);*/
		
		//infinity
		/*int i=5;
		do
		{
			System.out.println(i);
		}
		while(i>=1);*/
		
		//jumping statements using break
		/*for(int i=1; i<=10; i++)
		{
			if(i==5)
				break;
			System.out.print(i);
		}*/
		
		//continue
		for(int i=1; i<=10; i++)
		{
			if(i==5)
			continue;
			System.out.print(i);
		}
	}
}
