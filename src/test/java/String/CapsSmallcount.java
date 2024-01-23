package String;

public class CapsSmallcount {
	public static void main(String[] args) {
		String a = "PrasAnth123%%";
		int capcount = 0;
		int smallcount = 0;
		int digitcount = 0;
		int spcount = 0;

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (Character.isUpperCase(ch)) {
				capcount++;
			} else if (Character.isLowerCase(ch)) {
				smallcount++;
			} else if (Character.isDigit(ch)) {
				digitcount++;
			} else {
				spcount++;
			}
		}
		System.out.println(capcount);
		System.out.println(smallcount);
		System.out.println(digitcount);
		System.out.println(spcount);
	}
}
