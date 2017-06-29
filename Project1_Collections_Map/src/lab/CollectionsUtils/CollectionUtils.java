package lab.CollectionsUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionUtils {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		UtilsOfColletions();
	}

	private static void UtilsOfColletions() {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<5;i++){
			System.out.printf("> Element allocate at position[%d] is: ",i);
			int number = scanner.nextInt();
			list.add(number);
		}
		System.out.print("Original: ");
		System.out.println(list.toString());
		
		Collections.swap(list, 0, 3);
		System.out.print("After swap: ");
		System.out.println(list.toString());
		
		Collections.sort(list);
		System.out.print("After sort: ");
		System.out.println(list.toString());
		
		Collections.rotate(list,1);
		System.out.print("After rotate: ");
		System.out.println(list.toString());
		
		Collections.shuffle(list);
		System.out.print("After shuffle: ");
		System.out.println(list.toString());
	}

}
