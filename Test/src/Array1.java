
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[5];
		str[0]="aaaaa";
		str[1]="bbbbb";
		str[2]="ccccc";
		str[3]="ddddd";
		str[4]="eeeee";
		
		String even="";
		for(int i=0;i<str.length;i++) {
			if(i%2==0) {
				even=str[i];
				System.out.println("even elements is ="+even);
			}	
		}
		
		String odd ="";
		for(int i=0;i<str.length;i++) {
			if(i%2!=0) {
				odd=str[i];
				System.out.println("odd elements is ="+odd);
			}
		}
		
	}

}
