package nestediftask;
import java.util.Scanner;
public class Task_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/*System.out.println("Enter Marks: ");
		int marks = s.nextInt();
		System.out.println("Enter Income: ");
		int income = s.nextInt();
		if(marks >= 85)
		{
			if(income <= 250000)
			{
				System.out.println("Eligible for Schloarship");
			}
			else
			{
				System.out.println("Not Eligible for Scholarship");
			}
		}
			else
			{
				System.out.println("Not Eligible for Scholarship");
			}*/
		
		//task 61
		/*System.out.println("Enter Age: ");
		int age = s.nextInt();
		System.out.println("Enter Salary: ");
		int salary = s.nextInt();
		System.out.println("Enter Score: ");
		int score = s.nextInt();
		if(age >= 21)
		{
			if(salary >= 30000)
		{
			if(score >= 700)
			{
			System.out.println("Loan Approval");
			}
			else
		    {
				System.out.println(" Loan Not Approval");
			}
		}
			else
			{
			System.out.println("Loan not Approval");
			}
		}
			else
			{
			System.out.println("Loan Not Approval");
			}*/
		
		//Task 61
		System.out.println("Enter age: ");
		int age = s.nextInt();
		System.out.println("Degree? (yes/no): ");
		String degree = s.next();
		System.out.println("Enter Experience: ");
		int experience = s.nextInt();
		if(age >= 21)
		{
			if(degree.equals("Yes"))
			{
			
				if(experience >= 2)
				{
					System.out.println("Eligible");
				}
				else
				{
					System.out.println("Not Eligible");
					
				}
			}
		
			else
			{
				System.out.println("Not Eligible");
			}
		}
			else
			{
			System.out.println("Not eligible");	
			}
		}

	}


