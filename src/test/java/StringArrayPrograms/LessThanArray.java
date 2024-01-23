package StringArrayPrograms;

public class LessThanArray {
public static void main(String[] args) {
	int a[] = {100,20,400,5,800},temp;
	int b[] = new int[a.length-1];
	for(int i=0;i<a.length-1;i++) {
		b[i] = a[i]-a[i+1];
	}
	
	
	
	
	for (int i = 0; i < b.length; i++) {
		for (int j = i+1; j < b.length; j++) {
			if(b[i]>b[j]) {
				temp=b[i];
				b[i]= b[j];
				b[j]=temp;
				
			}
		}
	}
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
	
}
}

