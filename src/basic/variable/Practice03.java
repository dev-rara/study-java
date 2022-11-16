package basic.variable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Practice03 {

	public static void main(String[] args) {
		//      1. 자료형 - 리스트
		System.out.println("== 리스트 ==");
		ArrayList list1 = new ArrayList();

//      1-1. add
		list1.add(2);
		list1.add("Hello");
		list1.add(3);
		list1.add(4);
		list1.add("World!");
		System.out.println("list1: " + list1);

		list1.add(0, 1);
		System.out.println("list1: " + list1);

//      1-2. get
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));

//      1-3. size
		System.out.println(list1.size());

//      1-4. remove
		list1.remove(1);
		System.out.println("list1: " + list1);

		list1.remove(Integer.valueOf(1));
		System.out.println("list1: " + list1);

		list1.remove("Hello");
		System.out.println("list1: " + list1);


//      1-5. clear
		list1.clear();
		System.out.println("list1: " + list1);


//      1-6. sort
		ArrayList list2 = new ArrayList();
		list2.add(5);
		list2.add(3);
		list2.add(4);
		System.out.println("list2: " + list2);

		list2.sort(Comparator.naturalOrder());
		System.out.println("list2: " + list2);

		list2.sort(Comparator.reverseOrder());
		System.out.println("list2: " + list2);


//      1-7. contains
		System.out.println(list2.contains(1));
		System.out.println(list2.contains(3));


//      2. Maps
		System.out.println("== Maps ==");
		HashMap map = new HashMap();

//      2-1. put
		map.put("kiwi", 9000);
		map.put("apple", 10000);
		map.put("mango", 12000);
		System.out.println("map: " + map);

//      2-2. get
		System.out.println(map.get("mandarin"));
		System.out.println(map.get("apple"));

//      2-3. size
		System.out.println(map.size());

//      2-4. remove
		System.out.println(map.remove("hi"));
		System.out.println(map.remove("mango"));
		System.out.println("map: " + map);

//      2-5. containsKey
		System.out.println(map.containsKey("mango"));
		System.out.println(map.containsKey("kiwi"));


//      3. Generics
		System.out.println("== Generics ==");
		ArrayList list3 = new ArrayList();
		list3.add(1);
		list3.add("hello");
		System.out.println("list3: " + list3);

		ArrayList<String> list4 = new ArrayList<>();
		list4.add("hello");

		HashMap map2 = new HashMap();
		map2.put(123, "id");
		map2.put("apple", 10000);
		System.out.println("map2: " + map2);

		HashMap<String, Integer> map3 = new HashMap<>();
		map3.put("apple", 10000);
		System.out.println("map3: " + map3);

	}
}
