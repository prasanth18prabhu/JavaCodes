package StringArrayPrograms;

public class VowelsCount {

	public static void main(String[] args) {
		String a = "Vowels";
		int vowelsCount = 0;
		int consonantCount = 0;

		for (int i = 0; i < a.length(); i++) {
			char charAt = a.charAt(i);
			if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u') {
				vowelsCount++;
			} else {
				consonantCount++;
			}
		}
		System.out.println("vowelsCount : " + vowelsCount);
		System.out.println("consonantCount : " + consonantCount);

	}
}
