package lab.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		demo1();
	}

	private static void demo1() {
		/*Map - HashMap*/
//		Map<String,Double> map = new HashMap<String,Double>();
//		map.put("Tuan", 5.0);
//		map.put("Hanh", 8.0);
//		map.put("Hong", 3.0);
//		map.put("Phuong", 9.0);
//		map.put("Tuan", 7.0);
//		
//		System.out.print(map.toString());
		
		/* Map - TreeMap/Set/Entry */
		Map<String,Double> map = new TreeMap<String,Double>();
		map.put("Tuan", 5.0);
		map.put("Hanh", 8.0);
		map.put("Hong", 3.0);
		map.put("Phuong", 9.0);
		map.put("Tuan", 7.0);
		
		System.out.print(map.toString());
		System.out.println();
		
		Set<String> keys = map.keySet();
		System.out.println(keys.toString());
		for(String key:keys){
			Double mark = map.get(key);
			System.out.printf(">%s:%.2f\r\n",key,mark);
		}
		
		Set<Entry<String,Double>> entries = map.entrySet();
		System.out.println(entries.toString());
		for(Entry<String,Double> entry:entries){
			String name = entry.getKey();
			Double mark = entry.getValue();
			System.out.printf(">%s:%.2f\r\n",name,mark);
		}
	}

}
