package StringArrayPrograms;

public class SplitString {
	
	public static void split() {
		String a = "Hi Everyone";
		String[] split = a.split(" ");
		for(int i=0;i<split.length;i++) {
			System.out.println(split[i]);
		}
		System.out.println(split.length);
	}
	
	public static void toCharArray() {
		String a = "Hi Everyone";
		char[] charArray = a.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
		}
	}
	
public static void main(String[] args) {
	split();
//	toCharArray();
}
}
