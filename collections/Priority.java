package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) {
		PriorityQueue<String>a= new PriorityQueue<String>();
		a.add("abinaya");
		a.add("Shameena");
		a.add("Vedha");
		a.add("Sowmi");
		System.out.println(a);
		//System.out.println(a.element());
		System.out.println(a.peek());
		Iterator<String>itr = a.iterator();
		System.out.println("Before removing");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		a.remove();
		//a.poll();
		System.out.println("after removing");
		Iterator<String>it2 = a.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
		

	}

}
