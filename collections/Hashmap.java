package collections;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap h = new HashMap();
		//HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
		h.put(1, "apple");
		h.put(3,"mango");
		h.put(4,"banana");
		h.put(5,"Grapes");
		h.put(null, null);
		System.out.println(h);
		

	}

}
