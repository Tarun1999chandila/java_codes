package l8;

public class coinchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] denom = { 2, 3, 5, 6 };
		coinchange(denom, 10, "", 0);

	}

	public static void coinchange(int[] denom, int amount, String ans, int last) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		if (amount < 0) {
			return;
		}
		for (int i = last; i < denom.length; i++) {
			coinchange(denom, amount - denom[i], ans + denom[i], i);
		}
	}

}
