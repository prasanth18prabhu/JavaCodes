package String;

public class RemoveDuplicateStringArray {

	public static void main(String[] args) {
		String a[] = { "11", "name", "22", "33", "name", "33" };
		String output = "";
		String duplicates = "";
		for (int i = 0; i < a.length; i++) {
			if (output.contains(a[i])) {
				duplicates = duplicates + a[i] + ",";
			} else {
				output = output + a[i] + ",";
			}
		}
		System.out.println(output);
		System.out.println(duplicates);

	}

}
