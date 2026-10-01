package collections;
import java.util.LinkedList;
public class Linked_list {

	public static void main(String[] args) {
		LinkedList<Integer>a = new LinkedList<>();
		a.add(2);
		a.add(6);
		a.add(8);
		a.add(1);
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.contains(8));
		System.out.println(a.equals(a));
		System.out.println(a.indexOf(1));
		System.out.println(a.set(0, 8));
		System.out.println(a.size());
		
		

	}

}
