package l8;

public class polynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//power(5,7);
		System.out.println(palindromicsscount("nnitin"));
	}

	public static void power(int x, int n) {
		int ans = 0;
		int mult = x;
		for (int coeff = n; coeff > 0; coeff--) {
			ans = ans + coeff * mult;
			mult = mult * x;
		}
		System.out.println(ans);

	}

	public static int palindromicsscount(String str) {
		int count = 0;
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else
					break;
			}

		}
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					count++;
				} else
					break;
			}

		}

		return count;
	}
}
