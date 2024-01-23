package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Iterator {
	
public static void itertor() {
	List<Object> li = new ArrayList<>();
	li.add("Hi");
	li.add("everyone");
	java.util.Iterator<Object> iterator = li.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}

public static void map() {
	Map<String, Integer> emp = new LinkedHashMap<>();
	emp.put("Prasanth", 1);
	emp.put("Ram", 2);
	emp.put("Kishore", 3);
	System.out.println(emp.keySet());
	System.out.println(emp.containsKey("ram"));
	System.out.println(emp.values());
}

public static void arrayList() {
	Integer a [] = {100,200,20,222};
	List<Integer> li = new ArrayList<>(Arrays.asList(a));
	System.out.println(li);
	
	
}

public static void main(String[] args) {
	map();
	arrayList();
	
}
}