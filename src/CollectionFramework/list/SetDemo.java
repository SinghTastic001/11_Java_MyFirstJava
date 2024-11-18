package CollectionFramework.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		set.add(5);
		
		System.out.println(set);
		
//		Iterator
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(Integer data:set) {
			System.out.println(data);
		}
		
		Object[] arr = set.toArray();
		System.out.println(arr[0]);
		
		set.remove(2);
		set.remove(3);
		set.remove(4);
		
		System.out.println(set);
		
	}
}
