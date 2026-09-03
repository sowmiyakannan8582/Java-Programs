package laddertask;
import java.util.Scanner;
public class Task_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner signal = new Scanner(System.in);
		System.out.println("enter color");
		String s =   signal.next();
		if(signal.equals ("Red"))
			
		{
			System.out.println("stop");
		}
		else if(signal.equals ("Yellow"))
		{
			System.out.println("Wait");
		}
		else if(signal.equals ("Green"))
		{
			System.out.println("Go");
		}
		else
		{
			System.out.println("Invalid Signal");
		}
	}

}
