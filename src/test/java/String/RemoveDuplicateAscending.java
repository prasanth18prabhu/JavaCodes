package String;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateAscending {
	public static void main(String[] args) {
		int a[] = { 10000, 10, 10, 5, 5, 20, 20, 100, 50, 60, 60, 70 };
		Set<Integer> s = new TreeSet<>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		for (Integer integer : s) {
			System.out.println(integer);
		}
//		Object[] ar = s.toArray();
//		Arrays.sort(ar);
//		for (Object x : ar) {
//			System.out.println(x);
//		}
	}
}
