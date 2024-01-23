package StringArrayPrograms;

public class Reverse {
	public static void reverseWords() {
		String a = " Hi Hello";
		String rev = "";
		String[] split = a.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			rev = rev + split[i] + " ";
		}
		System.out.println(rev);
	}

	public static void reverseUsingStringbuffer() {
		String a = "Hello Welcome";
		StringBuffer s = new StringBuffer(a);
		s.delete(0, s.length());
		String x[] = a.split(" ");
		for (int i = x.length - 1; i >= 0; i--) {
			s.append(x[i] + " ");
		}
		System.out.println(s);

	}

	public static void reverseUsingStringbuffer2() {
		StringBuffer s = new StringBuffer("welcome everyone");
		String a = new String(s);
		s.delete(0, s.length());
		String x[] = a.split(" ");
		for (int i = x.length - 1; i >= 0; i--) {
			s.append(x[i] + " ");
		}
		System.out.println(s);
	}

	public static void reverseLetters() {
		String a = " Hi Hello";
		String rev = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			char charAt = a.charAt(i);
			rev = rev + charAt;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
//		reverseWords();
		reverseUsingStringbuffer();
//		reverseUsingStringbuffer2();
//		reverseLetters();

	}
}
