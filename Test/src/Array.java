
public class Array {
	public static void main(String args[]) {
		int[] a= {100,50,30,40,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		System.out.println("sum of all elements is ="+sum);
		
		int gr=0;
		for (int i=0;i<a.length;i++) {
			if(gr<a[i]) {
				gr=a[i];
			}
		}
		System.out.println("greater element is ="+gr);
		
		int sm=a[0];
		for(int i=0;i<a.length;i++) {
			if(sm>=a[i]) {
				sm=a[i];
			}
		}
		System.out.println("smallest element is = "+sm);
	}
	
	
}
