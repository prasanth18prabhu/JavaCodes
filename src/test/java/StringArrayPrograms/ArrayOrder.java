package StringArrayPrograms;

public class ArrayOrder {
	
	public static void ascendingOrder() {
		int a[] = {100,20,400,5,800},temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]= a[j];
					a[j]=temp;
					
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	
	public static void descendingOrder() {
		int a[] = {100,20,400,5,800},temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]= a[j];
					a[j]=temp;
					
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
//		ascendingOrder();
		descendingOrder();
		
	}

}
