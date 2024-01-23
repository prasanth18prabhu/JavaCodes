package String;

public class ChangingStringValues {

	public static void main(String[] args) {
		String a = "pRasaNth@*23*";
		StringBuffer s = new StringBuffer(a);
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (Character.isLowerCase(ch)) {
				s.setCharAt(i, Character.toUpperCase(ch));
			} else if (Character.isUpperCase(ch)) {
				s.setCharAt(i, Character.toLowerCase(ch));
			} else if (ch == '@') {
				s.replace(i, ch, "+");
			} else if (Character.isDigit(ch)) {
				s.append(ch);
			} else if (ch == '*') {
				s.replace(i, ch, "-");
			}
		}
		System.out.println(s);
	}

}
