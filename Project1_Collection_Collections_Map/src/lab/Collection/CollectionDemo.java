package lab.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo {
	
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		demo4();
	}

	private static void demo4() {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(3);
		list2.add(4);
		
		//list1.retainAll(list2);//the same part of 2 aggregation
		//System.out.print(list1.toString());
		
		//list1.removeAll(list2);//remove the same part of 2 aggregation
		//System.out.print(list1.toString());
		
		int i = list1.indexOf(3);//find position of element - only 1 value
		System.out.print(i);
	}

	private static void demo3() {
		/*set CAN NOT duplicate elements
		 * set HAS NOT position
		 * */
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(2);
		
		/*list CAN duplicate elements
		 * list HAS position
		 * */
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(0, 2);
		list.add(2);	
		
		//set.addAll(list);
		//System.out.println(set.toString());
		
		set.addAll(list);
		System.out.println(set.toString());
		
	}

	private static void demo2() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set.toString());
	}

	private static void demo1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(0, 2);
		list.add(3);
		System.out.println(list.toString());
	}

}
