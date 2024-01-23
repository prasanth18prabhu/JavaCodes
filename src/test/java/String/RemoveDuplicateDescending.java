package String;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateDescending {

	public static void main(String[] args) {
		int a[] = { 10, 20, 20, 100, 50, 60,212,212, 60, 70 }, temp;
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		Object[] ar = s.toArray();

		int b[] = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			b[i] = (int) ar[i];
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] < b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
