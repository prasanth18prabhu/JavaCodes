package String;

public class SmallIntoCaps {

	public static void withoutStringBuffer() {
		String a = "RRRRam";
		String rev = "";
		String res = "";
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (Character.isUpperCase(ch)) {
				res = res + Character.toLowerCase(ch);
			} else {
				res = res + Character.toUpperCase(ch);
			}
		}
		System.out.println(res);

		for (int i = res.length() - 1; i >= 0; i--) {
			char ch = res.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
	}

	public static void withStringBuffer() {
		String a = "PRASanth";
		StringBuffer s = new StringBuffer(a);
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (Character.isUpperCase(ch)) {
				s.setCharAt(i, Character.toLowerCase(ch));
			} else {
				s.setCharAt(i, Character.toUpperCase(ch));
			}
		}
		System.out.println(s);
		System.out.println(s.reverse());
	}

	public static void main(String[] args) {
//		withStringBuffer();
		withoutStringBuffer();
	}

}
