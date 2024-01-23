package String;

public class PrimeNumbers {
	public static void main(String[] args) {
		for(int k=1;k<=100;k++){
			int a =k;
			int count=0;
			for(int i=2;i<=a/2;i++){
			if(a%i==0){
			count=1;
			break;
			}
			}
			if(count==0){
			System.out.println(a);
			}
			}

	}
}
