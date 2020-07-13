package l4;

import java.util.Scanner;

public class array {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr=new int(n);
		int arr;
		int[] array = takeinput();
		// display(array);

		// System.out.println(max(array));
//		System.out.println(linearsearch(array, 40));
//		System.out.println(binarysearch(array, 40));

		// reverse(array);
		// rotate(array, 2);
		// int[] array2=inverse(array);
		// subarray(array);
		// subset(array);
		// bubblesort(array);
		// +
		selectionSort(array);
		insertionsort(array);
		display(array);
	}

	public static int[] takeinput() {
		System.out.println("size");
		int n = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {

			//
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.println(val);
		}
	}

	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;

	}

	public static int linearsearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}

		return -1;

	}

	public static int binarysearch(int[] arr, int item) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] < item) {
				low = mid + 1;
			} else if (arr[mid] > item) {
				high = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

	public static void reverse(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;

			low++;
			high--;
		}

	}

	public static int[] inverse(int[] arr) {
		int[] na = new int[arr.length];
		for (int i = 0; i <= arr.length - 1; i++) {
			na[arr[i]] = i;
		}
		return na;

	}

	public static void rotate(int[] arr, int rot) {
		rot = rot % arr.length;
		if (rot < 0) {
			rot = rot + arr.length;
		}

		for (int r = 0; r < rot; r++) {

			int temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i >= 1; i--) {
				arr[i] = arr[i - 1];

			}
			arr[0] = temp;
		}

	}

	public static void subset(int[] arr) {

		int limit = (int) Math.pow(2, arr.length);

		for (int i = 0; i <= limit - 1; i++) {
			int idx = 0;
			int rem = 0;
			int temp = i;
			while (temp != 0) {
				rem = temp % 2;

				if (rem == 1) {
					System.out.print(arr[idx] + " ");
				}

				idx++;
				temp = temp / 2;
			}
			System.out.println();
		}
	}

	public static void subarray(int[] arr) {
		for (int si = 0; si <= arr.length - 1; si++) {
			for (int ei = si; ei <= arr.length - 1; ei++) {
				for (int k = si; k <= ei; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();

			}
		}
	}

	public static void bubblesort(int[] arr) {
		int n = arr.length;
		for (int count = 0; count <= n - 2; count++) {
			for (int j = 0; j < n - count - 2; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
	}

	public static void selectionSort(int[] arr) {

		int n = arr.length;
		for (int count = 0; count <= n - 2; count++) {

			int min = count;

			for (int j = count + 1; j <= n - 1; j++) {

				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			int temp = arr[count];
			arr[count] = arr[min];
			arr[min] = temp;

		}

	}

	public static void insertionsort(int[] arr) {
		int n = arr.length;
		for (int count = 1; count <= n - 1; count++) {
			int temp = arr[count];
			int j = count - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;

		}
	}
}
