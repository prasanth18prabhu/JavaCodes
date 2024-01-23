package StringArrayPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		String a = "Welcome";
		Map<Character, Integer> map = new LinkedHashMap<>();
		char[] charArray = a.toCharArray();
		for (char c : charArray) {
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
