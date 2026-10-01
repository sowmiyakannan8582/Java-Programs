package exceptionhandling;

//import java.util.Scanner;

public class Logical_operator {

	public static void main(String[] args) {
		//AND
//	    try
//	    {
//	      int age = 20;
//	      int mark = 80;
//
//	      if (age >= 18 && mark >= 50)
//	            {
//	                System.out.println("Eligible");
//	            } 
//	       else 
//	            {
//	                System.out.println("Not Eligible");
//	            }
//	        }
//	        catch (Exception e)
//	        {
//	            System.out.println("Exception occurred");
//	        }
		
			//OR
//		  try
//		  {
//		   int a = 10;
//		   int b = 0;
//
//		   if (a > 5 || b > 0)
//		   {
//		        int result = a / b;
//		        System.out.println(result);
//			}
//		 }
//		    catch (ArithmeticException e) 
//		     {
//		        System.out.println("Cannot divide by zero");
//		     }
		
			//NOT
		try 
		{
		int age = 15;

		boolean eligible = age >= 18;

		 if (!eligible) 
		 {
		      System.out.println("Not eligible");
		 }
	}
		 catch (Exception e) 
		{
		      System.out.println("Exception occurred");
		}
	}
		
}
		
	    
	
	


