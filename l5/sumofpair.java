package l5;

import java.util.Scanner;
import java.util.Arrays;

class sumofpair {
	static Scanner scn = new Scanner(System.in);

	public static void main(String ags[]) {
		// int arr;
		
		int[] array = takeinput();
		
		display(array);
	
		
	}

	public static int[] takeinput() {
		
		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
			//Arrays.sort(arr);
		}
Arrays.sort(arr);
		int n1 = scn.nextInt();
		for (int j = 0; j < arr.length; j++) {
			for (int k = j + 1; k < arr.length; k++) {
				for (int l = j + 1; l < arr.length; l++) {

					if (arr[j] + arr[k] + arr[l] == n1 && arr[j] < arr[k] && arr[k] < arr[l]) {
						System.out.println(arr[j] + "," + " " + arr[k] + " " + "and " + " " + arr[l]);
					} else if (arr[j] + arr[k] + arr[l] == n1 && arr[k] < arr[l] && arr[l] < arr[j]) {
						System.out.println(arr[k] + "," + " " + arr[l] + " " + "and " + " " + arr[j]);
					} else if (arr[j] + arr[k] + arr[l] == n1 && arr[l] < arr[j] && arr[j] < arr[k]) {
						System.out.println(arr[l] + "," + " " + arr[j] + " " + "and " + " " + arr[k]);
					}
				}
			}
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.println(val);

		}
	}
}
