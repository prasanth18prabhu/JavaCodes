package StringArrayPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		String a = "Welcome Everyone Welcome";
		Map<String, Integer> map = new LinkedHashMap<>();
		String[] split = a.split(" ");
		for (String c : split) {
			if(map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, count+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
