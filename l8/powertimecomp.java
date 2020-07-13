package l8;

public class powertimecomp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(power(2,6));
	}
	public static int power(int x,int n) {
		
		if(n==1) {
			return x;
		}
		if(n%2==0) {
		int pow1=power(x,n/2);
		int pw=pow1*pow1;
		return pw;
		}
		else {
			int pow1=power(x,n/2);
			int pw=pow1*pow1*x;
			return pw;
		}
		
	}

}
