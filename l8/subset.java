package l8;

public class subset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] denom = { 1,2,3 };
		coinchange(denom, 3, "",0);

	}

	public static void coinchange(int[] denom, int amount, String ans,int last) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		if (amount < 0) {
			return;
		}
		for (int i = last; i < denom.length; i++) {
		
					coinchange(denom, amount - denom[i], ans + denom[i],i+1);

			}
			
	}
}
