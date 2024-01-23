package Collection;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:SS");
		String format = now.format(ofPattern);
		System.out.println(format);
	}
}
