package collections;
import java.util.ArrayList;
public class Practice_questions {

	public static void main(String[] args) {
//		ArrayList<String>names = new ArrayList<>();
//		names.add("Sowmi");
//		names.add("Koushi");
//		names.add("Santhosh");
//		names.add("Elango");
//		names.add("Deepa");
//		System.out.println(names.contains("Koushi"));
		
		//EvenNumber-----
//		ArrayList<Integer>numbers = new ArrayList<>();
//		numbers.add(10);
//		numbers.add(15);
//		numbers.add(20);
//		numbers.add(25);
//		for(int i=0; i<numbers.size(); i++)
//		{
//			if(numbers.get(i)%2 == 0)
//			{
//				System.out.println(numbers.get(i));
//			}
//		}
		
		//for loop - print all elements
//		ArrayList<String>names = new ArrayList<>();
//		names.add("Abi");
//		names.add("Anu");
//		names.add("Nandhini");
//		
//		for(int i=0; i<names.size(); i++)
//		{
//			System.out.println(names.get(i));
//		}
		
		//Largest Number-----
		ArrayList<Integer>numbers = new ArrayList<>();
		numbers.add(20);
		numbers.add(36);
		numbers.add(56);
		numbers.add(78);
		int largest = numbers.get(0);
		for(int i=1; i<numbers.size(); i++)
		{
			if(numbers.get(i) > largest)
			{
				largest = numbers.get(i);
				
			}
		}
		System.out.println("Largest = " + largest);
		
		
	}

}
