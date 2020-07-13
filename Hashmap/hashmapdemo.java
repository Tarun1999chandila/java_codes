package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class hashmapdemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(maxfreq("aaabcccaaaa"));

		int[] one = { 10, 10, 10, 20, 30 };
		int[] two = { 10, 10, 20, 20, 20, 65 };

		intersection(one, two);

		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6, 4 };
		longestConsecutiveSeq(arr);
	}
	public static char maxfreq(String str) {
		// System.out.println("h");
		// map.put("a");
		HashMap<Character, Integer> map = new HashMap<>();
		// String s= "aabbadaa";
		// Set<String> keys=map.keyset;
		int maxfre = 0;
		//char maxfrechar = 0;
		int val = 0;
		// int max=0;
		for (int i = 0; i <= str.length(); i++) {
			char ch = str.charAt(i);
			int of = map.getOrDefault(ch, 0) + 1;
			map.put(ch, of);
		}
		char temp=' ';
		for(Character ch:map.keySet()) {
		if (map.get(ch) > maxfre) {
			maxfre = ch;
			temp=ch;
		}
		}
		return temp;

	}

	public static void intersection(int[] one, int[] two) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < one.length; i++) {
			int item = one[i];

			int nf = map.getOrDefault(item, 0) + 1;
			map.put(item, nf);

		}

		for (int j = 0; j < two.length; j++) {

			int item = two[j];

			if (map.containsKey(item) && map.get(item) > 0) {
				System.out.println(item);
				map.put(item, map.get(item) - 1);
			}

		}

	}
	public static void longestConsecutiveSeq(int[] arr) {

		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int item = arr[i];

			if (map.containsKey(item - 1)) {
				map.put(item, false);
			} else {
				map.put(item, true);
			}

			if (map.containsKey(item + 1)) {
				map.put(item + 1, false);
			}

		}

		int maxCount = 0;
		int starting = 0;

		// loop on entire key set
		for (int key : map.keySet()) {

			// filter out the keys corresponding to which true is kept
			if (map.get(key)) {

				int count = 0;

				while (map.containsKey(key + count)) {
					count++;
				}

				// max length
				if (count > maxCount) {
					maxCount = count;
					starting = key;
				}

			}

		}

		for (int i = 0; i < maxCount; i++) {
			System.out.println(starting + i);
		}

	}
}