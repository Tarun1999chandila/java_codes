package crux5june2019;

public class rvr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123456789;
		int rem;
		int ans = 0;
		while (n != 0) {
			rem = n % 10;
			n = n / 10;
			ans = ans * 10 + rem;
		}
		System.out.println(ans);
	}

}
