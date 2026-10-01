package stringprograms;

import java.util.Scanner;

public class Task_4 {
	static void name(String a)
	{
	int count = 0;
	System.out.println("Reverse Number");
	for(int i=a.length()-1; i>=0; i--)
	{
		System.out.println(a.charAt(i));
	}
	for(int i=0; i<a.length(); i++)
	{
		char ch = a.charAt(i);
		if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.print(ch +" " + count++);
		}
	}
	System.out.println(count);	
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String a = s.nextLine();
		name(a);
		
		
		
		
		
	}

}
