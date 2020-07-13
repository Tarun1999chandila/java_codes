package l7;

import java.util.Scanner;

public class frequency {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		// duplicate(str);
		// ascii2(str);
		// System.out.println(duplicate1(str));
		// System.out.println(frequency(str));
		compression(str);
	}

	public static char frequency(String str) {
		int max = Integer.MIN_VALUE;
		char temp = str.charAt(0);

		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					if (count > max) {
						max = count;
						temp = str.charAt(i);
					}
				}
			}
		}
		return temp;

	}

	public static void compression(String str) {
		//int max = Integer.MIN_VALUE;

		for (int i = 0; i < str.length(); i++) {

			int count = 0;
			for (int j = i; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
				else
					break;
			}

			if (count > 1) {

				System.out.print(str.charAt(i) + "" + count);
			i=i+count-1;
			} else

				System.out.print(str.charAt(i));

		}

	}
}
