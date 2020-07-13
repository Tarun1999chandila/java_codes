package l5;

import java.util.Scanner;

class evenoddkejriwal {
	public static void main(String ags[]) {
		Scanner scn = new Scanner(System.in);
		int digits = scn.nextInt();
		int rem = 0;
		int even =0;
		int odd = 0;
		
	

		for (int i = 0; i < digits; i++) {
			int n = scn.nextInt();

			while (n != 0) {
				rem = n % 10;
				n = n / 10;

				if (rem % 2 == 0) {
					even =  even + rem;
//System.out.println(even);
				} else {
					odd = odd + rem;
					

				}
			}
		
			System.out.println(even);
			System.out.println(odd);
			if (even % 4 == 0 || odd % 3 == 0) {
				System.out.println("yes");
			} else {
				System.out.println("no");

			}
even=0;
odd=0;
		}

	}
}
