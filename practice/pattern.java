package practice;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern1();
		pattern2();
		pattern3();
		pattern4();
		pattern5();
		pattern6();
		pattern7();
		pattern8();
	}

	public static void pattern1() {
		int n = 5;
		for (int i = 0; i <= n; i++) {
			System.out.print("*");
			System.out.print("\n");
		}
	}

	public static void pattern2() {
		int n = 5;
		int row = 1;
		while (row <= n) {
			int nst = 1;
			while (nst <= n) {
				System.out.print("*");
				nst++;
			}
			row++;
			System.out.println();
		}
	}

	public static void pattern3() {
		int n = 5;
		int row = 1;
		while (row <= n) {
			int nst = 1;
			while (nst <= row) {
				System.out.print("*");
				nst++;
			}
			row++;
			System.out.println();
		}
	}

	public static void pattern4() {
		int n = 5;
		int row = 1;
		int nst = n;
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			System.out.println();
			row++;
			nst--;
		}
	}

	public static void pattern5() {
		int n = 5;
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;

			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;

			}
			row++;
			nst++;
			nsp--;
			System.out.println();
		}
	}

	public static void pattern6() {
		int n = 5;
		int nsp = 0;
		int nst = n;
		int row = 1;
		while (row <= n) {

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;

			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;

			}
			row++;
			nst--;
			nsp++;
			System.out.println();
		}
	}

	public static void pattern7() {
		int n = 5;
		int nsp = 0;
		int nst = n;
		int row = 1;
		while (row <= n) {

			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;

			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;

			}
			row++;
			nst--;
			nsp = nsp + 2;
			System.out.println();
		}
	}

	public static void pattern8() {
		int n = 5;
		int nst = n;
		int row = 1;
		int nsp = n/2+1;
		while (row <= n) {
			int cst = 1;

			while (cst <= nst) {
				if (row == 1 || row == n || cst == 1 || cst == n) {
					System.out.print("*");
					

				}
				else {
					System.out.print(" ");
				}
				
				cst=cst+1;
			}
			
			
			
				row++;
				//nsp++;
				System.out.println();
			}

			// nst++;
			//row++;
			// nsp++;
			
		}
//	public static void pattern9() {
//		int n=5;
//		int nst
//	}
	}


