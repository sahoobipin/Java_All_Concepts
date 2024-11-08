package com.bbs.datastructure;

public class SelectionSort {
	public static void main(String[] args) {

		int a[] = { 8, 7, 5, 6, 2 };

		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		for (int num : a) {
			System.out.print(num + " ");
		}
	}
}
