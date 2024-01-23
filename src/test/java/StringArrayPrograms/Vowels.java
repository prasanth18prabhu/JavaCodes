package StringArrayPrograms;

public class Vowels {
	public static void main(String[] args) {
		String a = "Vowels";
		String vowels = "";
		String consonants = "";

		for (int i = 0; i < a.length(); i++) {
			char charAt = a.charAt(i);
			if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u') {
				vowels = vowels + charAt;

			} else {
				consonants = consonants + charAt;
			}
		}
		System.out.println("vowels : " + vowels);
		System.out.println("consonants : " + consonants);

	}
}
