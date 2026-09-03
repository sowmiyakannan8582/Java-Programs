package arrayprogram;
import java.util.Scanner;


public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[]a= {10,5,20,8,15};
//		int max= a[0];
//		int min= a[0];
//		for(int i=1; i<a.length; i++)
//		{
//			if(a[i] > max)
//				max = a[i];
//						
//			if(a[i] <min)
//				min = a[i];
//			{
//				System.out.println("Maximum = " +max);
//				System.out.println("Minimum = " +min);
//			}
	
//      }
		
		//ascending order
//		int[] a= {5,8,9,4,3};
//		Arrays.sort(a);
//		for(int i:a)
//		{
//			System.out.println(i);
//		}
		
		//duplicate array
//		int []a= {10,20,4,7,20,10};
//		for( int i=0; i<a.length; i++)
//		{
//			for( int j =i+1; j <a.length; j++)
//			{
//				if(a[i] == a[j])
//				{
//					System.out.println("Duplicate =" + a[i]);
//				}
//			}
//		}
		
		//descending order
//		int[]a = {2,8,4,7,1};
//		Arrays.sort(a);
//		for(int i = a.length -1; i>=0; i--)
//		{
//			System.out.println(a[i]);
//		}
		
//		int[]a= {10,20,30,40,50};
//		int search = 30;
//		for(int i=0; i<a.length; i++)
//		{
//		
//			if(a[i] ==  search)
//			{
//				System.out.println(a[i]);
//			}
//		}
		Scanner s = new Scanner(System.in);
		int rollno[] = new int[5];
		String name[]= new String[5];
		int mark1[]= new int[5];
		int mark2[]= new int[5];
		int mark3[]= new int[5];
		for(int i=0; i<5; i++)
		{
			System.out.println("Student Details"+(i+1));
			System.out.println("Enter Roll No: ");
			rollno[i] = s.nextInt();
			System.out.println("Enter Name: ");
			name[i]= s.next();
			System.out.println("Enter Mark1: ");
			mark1[i]= s.nextInt();
			System.out.println("Enter Mark2: ");
			mark2[i]= s.nextInt();
			System.out.println("Enter Mark3: ");
			mark3[i]= s.nextInt();
		}
			System.out.println("Student Result");
		
		for(int i=0; i<5; i++)
		{
			int total= mark1[i]+mark2[i]+mark3[i];
			double average = total/3.0;
			String remark;
			
		if(average >=85)
			remark="excellent";
		else if(average >=75)
			remark="Distinction";
		else if(average >=60)
			remark="First Class";
		else if(average >= 40)
			remark="pass";
		else 
			remark="Fail";
		
		
		System.out.println(rollno[i]);
		System.out.println(name[i]);
		System.out.println(total);
		System.out.println(average);
		System.out.println(remark);
		
	    }
			
	}
			

	}


