package nestediftask;
import java.util.Scanner;
public class Task_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/*System.out.println("Enter Age:");
		int age = s.nextInt();
		System.out.println("Are You Citizen?(yes/no):");
		String citizenship = s.next();
		if(age >= 18)
		{
			if(citizenship.equals("yes"))
			{
				System.out.println("Eligible to vote");
			}
		}*/
		
		//task 58
		/*int correctpin = 1234;
		int balance = 1000;
		System.out.println("Enter Pin: ");
		int pin = s.nextInt();
		if(pin == correctpin)
		{
			System.out.println("Enter Withdrawl Amount :");
			int amount = s.nextInt();
			if(amount > 0)
			{
			if(amount <= balance)
			{
				System.out.println("Withdrawl Successfully");
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}
			else
			{
				System.out.println("Invalid Withdrawl Amount");
			}
	}
			else
			{
				System.out.println("Invalid Pin");
			}*/
		
		//task 59
		System.out.println("Enter Attendance Percentage:");
		int attendance = s.nextInt();
		System.out.println("Enter Internal Marks: ");
		int marks = s.nextInt();
		if(attendance >= 75)
		{
			if(marks >= 40)
			{
				System.out.println("Allowed to Exam");
			}
			else
			{
				System.out.println("Not Allowed to Exam");
			}
		}
			else
			{
				System.out.println("Not Allowed to Exam");
			}
		
		}
		
		
			

	}


