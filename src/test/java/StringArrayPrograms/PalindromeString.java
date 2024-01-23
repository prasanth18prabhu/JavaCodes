package StringArrayPrograms;

public class PalindromeString {
public static void main(String[] args) {
	String a = "Madam";
	String rev = "";
	
	for(int i = a.length()-1;i>=0;i--) {
		char charAt = a.charAt(i);
		rev = rev+charAt;
	}
	if(rev.equalsIgnoreCase(a)) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not a Palindrome");
	}
	
}
}
