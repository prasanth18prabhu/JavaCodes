package Collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapGetKey {
public static void main(String[] args) {
	Map<String, Integer> m = new LinkedHashMap<>();
	m.put("ram", 1);
	m.put("sam", 2);
	m.put("kanna", 3);
	m.put("nakul", 4);
	m.put("prasanth", 5);

	Set<Entry<String, Integer>> e = m.entrySet();
	for(Entry<String, Integer> x : e){
	System.out.println(x.getKey());
	if(x.getKey()=="kanna"){
	break;
	}
	}
	
	
	
}}
