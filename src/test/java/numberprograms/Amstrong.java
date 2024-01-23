package numberprograms;

public class Amstrong {
	public static void main(String[] args) {
		int a = 153;
		int n = a;
		int i = 0, j = 0;
		while (a > 0) {
			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;
		}
		if (n == j) {
			System.out.println("Amstrong");
		} else {
			System.out.println("Not a Amstrong");
		}
	}
}
