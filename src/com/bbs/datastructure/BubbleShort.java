package com.bbs.datastructure;

public class BubbleShort {
	public static void main(String[] args) {

		int a[] = { 8, 7, 5, 6, 2 };

		// Bubble Sort Logic
		for (int i = 0; i < a.length - 1; i++) { // Loop through all elements
			for (int j = 0; j < a.length - 1 - i; j++) { // Compare adjacent elements
				if (a[j] > a[j + 1]) { // If current element is greater than next element
					// Swap elements
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		// Print sorted array
		for (int num : a) {
			System.out.print(num + " ");
		}
	}
}