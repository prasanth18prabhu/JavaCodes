
public class Prime {
public static void main(String[] args) {
	int[] array ={1,2,3,5,6,7,10,13};

	for (int i = 0; i <array.length ; i++) {
	    int arr = array[i];
	    int count = 0;
	    for (int j = 2; j <arr/2 ; j++) {
	        if (arr%j==0){
	            count++;
	        }
	    }
	    if (count==0){
	        System.out.println("Prime Number: "+arr);
	    }else{
	        System.out.println("Not a Prime Number: "+arr);

	    }
	}}
}
