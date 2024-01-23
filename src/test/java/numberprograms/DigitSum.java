package numberprograms;

public class DigitSum {
	public static void main(String[] args) {
		int a = 123;
		int sum = 0;
		int i = 0;
		while (a > 0) {
			i = a % 10;
			sum = sum + i;
			a = a / 10;
		}
		System.out.println(sum);
	}
}
