package stringprograms;

import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Word: ");
		String a = s.nextLine();
		String b[] = a.split(" ");
		String longest = " ";
		for(int i=0; i<b.length; i++)
		{
			if(b[i].length()>longest.length())
			{
				longest = b[i];
			}
		}
		System.out.println(longest); 
		System.out.println(longest.length());

	}

}
