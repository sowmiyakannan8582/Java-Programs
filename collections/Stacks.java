package collections;

import java.util.Iterator;
import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		Stack<String> a = new Stack<String>();
		a.push("bike");
		a.push("Car");
		a.push("Flight");
		a.push("Cycle");
		System.out.println(a);
		a.pop();
		System.out.println(a);
		Iterator<String>itr = a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
