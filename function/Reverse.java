package function;

public class Reverse {
//	static String rever(String a)
//	{
//	String reverse = "";
//	for(int i=a.length()-1; i>=0; i--)
//			{
//				reverse = reverse + a.charAt(i);
//			}
//	if(a.equals(reverse))
//	{
//		System.out.println("It is reverse");
//	}
//	else
//	{
//		System.out.println("It is not Reverse");
//	}
//	return a;
//	}


//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		rever("mom");
	
static int fact(int n)
{
	if(n==1)
	{
		return 1;
	}
	else
	{
		return n*fact (n-1);
	}
}
	public static void main(String [] args)
	{
		System.out.println(fact(5));
		
	}
	}


