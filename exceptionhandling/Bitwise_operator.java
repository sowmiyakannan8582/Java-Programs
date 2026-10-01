package exceptionhandling;

public class Bitwise_operator {

	//XOR OPERATOR
	public static void main(String[] args) {
		
//	 try
//	 {
//	 int a = 10;
//	 int b = 5;
//
//	 int result = a ^ b;
//
//	 System.out.println("Bitwise XOR = " + result);
//
//	 int x = 10 / 0;
//	 }
		
//	 catch (ArithmeticException e)
//	 {
//	  System.out.println("Arithmetic Exception");
//	 }      

			//AND OPERATOR
		
		try 
		{
		 int a = 10;
		 int b = 5;

		 int result = a & b;

		 System.out.println("Bitwise AND = " + result);

		 int x = 10 / 0;
		 }
		 catch (ArithmeticException e)
		 {
		 System.out.println("Cannot divide by zero");
		 }
}
		
}
	