package numberprograms;

public class Fibanocii {
	public static void fibanociiSeries() {
		int a = 0, b = 1, c = 0;
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.println(a);
			a = b;
			b = c;
		}
	}

	public static void fibanociiSeriesWithinNumbers() {
		int a = 0, b = 1, c = 0;
		for (int i = 1; i <= 30; i++) {
			c = a + b;
			if (a < 200) {
				System.out.println(a);
			}
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {
		fibanociiSeries();
//		fibanociiSeriesWithinNumbers();
	}
}
