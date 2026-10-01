package exceptionhandling;

public class Loops {
	//for loop
	public static void main(String[] args) 
	{
//		try
//		{
//		  for (int i = 1; i <= 5; i++) {
//		  System.out.println(i);
//
//		  int result = 10 / (i - 3);
//		  System.out.println("Result = " + result);
//		}
//		       
//}
//		  catch (ArithmeticException e)
//		{
//		   System.out.println("Cannot divide by zero");
//		}
		
			//WHILE LOOP
		try 
			{
		    int i = 1;

		     while (i <= 5) {
		     System.out.println("Number = " + i);

		     int result = 20 / (i - 2);
		     System.out.println("Result = " + result);

		     i++;
		     }
		   }
		     catch (ArithmeticException e)
			{
		      System.out.println("Arithmetic Exception");
			}
	}
		
 }
		