package numberprograms;

public class FibanociiNumbers {

	public static void sumOfFibanociiSeries() {
		int a = 0, b = 1, c = 0;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			sum = sum + a;

			a = b;
			b = c;
		}
		System.out.println(sum);
	}

	public static void countOfFibanociiSeries() {
		int a = 0, b = 1, c = 0;
		int count = 0;
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			count = count + 1;

		}
		System.out.println(count);
		a = b;
		b = c;
	}

	public static void main(String[] args) {
//		sumOfFibanociiSeries();
		countOfFibanociiSeries();
	}
}
