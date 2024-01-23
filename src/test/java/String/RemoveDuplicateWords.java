package String;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String res = "";
		String a = "Hi Hello Hi Ho hi";
		String x[] = a.split(" ");
		Set<String> s = new LinkedHashSet<>(Arrays.asList(x));
		for (String xx : s) {
			res = res + xx + " ";
		}
		System.out.println(res.trim());
	}

}
