package exceptionhandling;

public class Increment_Decrement {
	
	//Increment
	public static void main(String[] args) {
//		try
//		{
//	     int a = 10;
//
//	     a++;
//	    	 System.out.println("After Increment = " + a);
//
//	     int b = 10 / 0;
//	     System.out.println(b);
//	        
//		}
//	     catch (ArithmeticException e)
//			{
//	           System.out.println("Cannot divide by zero");
//	        }
		
	//DECREMENT
		
		try
		{
		int a = 10;

		 a--;
		    System.out.println("After Decrement = " + a);

		int b = 20 / 0;
		    System.out.println(b);
		}
		
		catch (ArithmeticException e)
		 {
		     System.out.println("Cannot divide by zero");
		 }
}
		
}
	

	


