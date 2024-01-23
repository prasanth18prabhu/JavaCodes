package String;

public class PrimeCount {

	public static void main(String[] args) {
		int pcount=0;
		for(int k=1;k<=15;k++){
		int a =k;
		int count=0;
		for(int i=2;i<=a/2;i++){
		if(a%i==0){
		count=1;
		break;
		}
		}
		if(count==0){
		pcount++;
		}
		}
		System.out.println(pcount);

	}

}
