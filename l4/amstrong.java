package l4;

public class amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printamstrong(0, 1000);
	}

	public static void printamstrong(int lo, int hi) {
		for (int n = lo; n <= hi; n++) {
			boolean res = isamstrong(n);
			if (res)
				System.out.println(n);

		}
	}

	public static boolean isamstrong(int n) {
		int temp = n;
		int ans = 0;
		int nod = noofdigits(n);
		while (n != 0) {
			int rem = n % 10;
			ans = ans + (int) Math.pow(rem, nod);
			n = n / 10;
		}

		if (temp == ans) {
			return true;
		} else {
			return false;
		}
	}

	public static int noofdigits(int n) {
		int count = 0;
		int rem = 0;
		while (n != 0) {
			n = n / 10;
			count = count + 1;

		}
		return count;
	}
}
