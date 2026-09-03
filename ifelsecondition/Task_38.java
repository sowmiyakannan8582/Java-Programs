package ifelsecondition;
import java.util.Scanner; 
public class Task_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		/*System.out.println("Enter days: ");
		String day = s.nextLine();
	
		if(day.equals("sunday"))
		{
			System.out.println("weekend");
		}
		else
		{
			System.out.println("working day");
		}*/
		
		//task 39
		/*System.out.println("Enter Marks of Student1 : ");
		System.out.println("Enter Marks of Student2 : ");
		int mark1 = s.nextInt();
		int mark2 = s.nextInt();
		if(mark1 > mark2)
		{
			System.out.println("Student1 is high score");
		}
		else
		{
			System.out.println("Student2 is high score");
		}*/
		
		//task 40
		System.out.println("Enter Attendance Percentage: ");
		int attendance = s.nextInt();
		if(attendance >= 75)
		{
			System.out.println("Allowed to Write Exam");
		}
		else
		{
			System.out.println("Not Allowed");
		}
		

	}

}
