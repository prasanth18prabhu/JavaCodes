package String;

public class ChangingStringValues2 {
	public static void main(String[] args) {
		String a = "pRasaNth@@@@23****";
		String first = a.substring(0,1);
		String last = a.substring(1);

		String upper = first.toUpperCase();
		String lower = last.toLowerCase();

		String res="";
		res=res+upper+lower;
		StringBuffer s = new StringBuffer(res);

		for(int i=0;i<res.length();i++){
		char ch = res.charAt(i);
		if(Character.isLowerCase(ch)){
		s.setCharAt(i, Character.toUpperCase(ch));
		}else if (Character.isUpperCase(ch)){
		s.setCharAt(i, Character.toLowerCase(ch));
		}
		else if(ch=='@'){
		s.replace(i, ch, "+");
		}else if(Character.isDigit(ch)){
		s.append(ch);
		}else if(ch=='*'){
		s.replace(i, ch, "-");
		}
		}
		System.out.println(s);
	}
}
