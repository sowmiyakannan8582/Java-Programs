package arrayprogram;
import java.util.Scanner;
public class Task_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]= {2,12,4,9,18,25,3,32,20,1};
//		int onedigitnumber = 0;
//		int twodigitnumber = 0;
//		for(int i=0; i<a.length; i++)
//		{
//			if(a[i]>=0 && a[i]<=9)
//			{
//				onedigitnumber = onedigitnumber + a[i];
//			}
//			else if(a[i]>=10 && a[i]<=99)
//			{
//				twodigitnumber = twodigitnumber + a[i];
//			}
//		}
//			System.out.println(onedigitnumber);	
//			System.out.println(twodigitnumber);
		
		Scanner s = new Scanner(System.in);
		int a[]=new int[20];
		System.out.println("Enter the Value: ");
		for(int i=0; i<20; i++)
		{
			a[i]=s.nextInt();
		}
		int largest = 0;
		int smallest =0;
		int sum = 0;
		for(int i=0; i<20; i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
			sum = sum + a[i];
		}
		System.out.println(largest);
		System.out.println(smallest);
		System.out.println(sum);
		}
	}


