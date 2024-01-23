package numberprograms;

public class OddNumbersInValue {

	public static void main(String[] args) {
		int a = 545116520;
		int i=0;
		int oddcount =0;
		int evencount =0;
		while(a>0){
		i = a%10;
		if(a%2==0){
			evencount++;
		}else{
			oddcount++;
		}
		a=a/10;
		}
		System.out.println(oddcount);
		System.out.println(evencount);

	}

}
