package StringArrayPrograms;

public class InitialCapital {

	public static void main(String[] args) {
		String output = "";
		String a = "my name is prasanth";
		String[] split = a.split(" ");
		for (String string : split) {
			String substring = string.substring(0, 1);
			String substring2 = string.substring(1);
			output = output + substring.toUpperCase() + substring2 + " ";
		}
		System.out.println(output);
	}

}
