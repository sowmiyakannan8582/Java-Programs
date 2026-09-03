package task1;
import java.util.Scanner;
public class Task_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first no :");
		int a = s.nextInt();
		System.out.println("Enter second no :");
		int b = s.nextInt();
		
		int min = (a<b) ? a:b;
		int max = (a>b) ? a:b;
		
		System.out.println("minimum =" + min);
		System.out.println("maximum =" + max);
		
	}
}
		
		
		
		
		



