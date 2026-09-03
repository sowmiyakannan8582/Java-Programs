package laddertask;
import java.util.Scanner;
public class Task_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/*System.out.println("Enter Amount");
		int bill = s.nextInt();//
		if(bill <= 100 )
		{
			System.out.println("2/Unit");
		}
		else if(bill <= 200 )
		{
			System.out.println("3/Unit");
		}
		else if(bill <= 500)
		{
			System.out.println("5/Unit");
		}
		else
		{
			System.out.println("7/Unit");
		}*/

		//task 48
		/*System.out.println("Enter Salary :");
		int income = s.nextInt();
		if(income <= 20000)
		{
			System.out.println("Low Income");
			
		}
		else if(income <= 50000)
		{
			System.out.println("Medium Income");
		}
		else if(income <= 100000)
		{
			System.out.println("High Income");
		}
		else
		{
			System.out.println("very High Income");
		}*/
		
		//task 49
		System.out.println("Enter Internet Value");
		int n = s.nextInt();
		if(n < 5 )
		{
			System.out.println("Very Slow");
		}
		else if(n <= 20)
		{
			System.out.println("Average");
		}
		else if(n <= 100)
		{
			System.out.println("Fast");
		}
		else 
		{
			System.out.println("Very Fast");
		}
	}

}
