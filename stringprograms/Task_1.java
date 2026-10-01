package stringprograms;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.println("Enter Word:");
//		String a = s.nextLine();
//		System.out.println("Enter Char:");
//		char c = s.next().charAt(0);
//		int count = 0;
//		for(int i=0; i<a.length(); i++)
//		{
//			if(a.charAt(i)==c)
//			{
//				count++;
//			}
//		}
//		System.out.println("number of "+ c + count);
		
		
		System.out.println("Enter Word: ");
		String a = s.nextLine();
		int count = 0;
		for(int i=0; i<a.length(); i++) {
			
		char ch = a.charAt(i);
		
			if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u')
			{
				System.out.print(ch +" " + count++);
			}
		}
		System.out.println("number of vowels" + count);
		
	}
	
		
		
		

	


}