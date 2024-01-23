package String;

import java.util.LinkedHashSet;

public class RemoveCharacterDuplicate {

	public static void main(String[] args) {
		String str = "prasanthPPxx";
		LinkedHashSet<Character> s = new LinkedHashSet();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			s.add(ch);
		}
		for (Character c : s) {
			System.out.print(c);
		}

	}

}
