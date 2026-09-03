package laddertask;
import java.util.Scanner;
public class Task_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/*System.out.println("Enter Age :");
		int age = s.nextInt();
		if(age <= 0)
		{
			System.out.println("Child");
		}
		else if(age <= 19)
		{
			System.out.println("Teenager");
		}
		else if(age <= 39)
		{
			System.out.println("Adult");
		}
		else if(age <= 59)
		{
			System.out.println("Middle Age");
		}
		else 
		{
			System.out.println("Senior Citizen");
		}*/
		
		//task 45
		/*System.out.println("Enter Temperature: ");
		int temp = s.nextInt();
		if(temp < 10)
		{
			System.out.println("very cold");
		}
		else if(temp <= 20)
		{
			System.out.println("Cold");
		}
		else if(temp <= 30)
		{
			System.out.println("Normal");
		}
		else if(temp <= 40)
		{
			System.out.println("Hot");
		}
		else
		{
			System.out.println("Very Hot");
		}*/
		
		//task 46
		System.out.println("Enter Value :");
		double bmi = s.nextDouble();
		if(bmi <= 18.5 )
		{
			System.out.println("Underweight");
		}
		else if(bmi <= 24.9 )
		{
			System.out.println("Normal");
		}
		else if(bmi <= 29.9 )
		{
			System.out.println("Overweight");
		}
		else
		{
			System.out.println("Obese");
		}
	}

}
