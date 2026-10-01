package stringprograms;

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String a = s.nextLine();
		a=a.toUpperCase();
		String b[] = a.split(" ");
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}

	}

}
