package String;

public class Prime {
	public static void main(String[] args) {
		int a = 11;
		int count = 0;
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				count = count + 1;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Prime");
		} else {
			System.out.println(" Not a Prime");
		}
	}
}
