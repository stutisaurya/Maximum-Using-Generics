package com.Generics;

public class FindMax<T extends Comparable<T>> {

	T x, y, z;

	public FindMax(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static <T extends Comparable<T>> T checkMaximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		printMax(max);
		return max;
	}

	public static String testMaximum(String x, String y, String z) {
		String max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		printMax(max);
		return max;
	}

	public static <T> void printMax(T max) {
		System.out.println("Max of Three  is " + max);
	}

	public static void main(String[] args) {
		Integer n = checkMaximum(10, 23, 15);
		Double d = checkMaximum(12.5, 13.4, 22.0);
		String a = "Apple", b = "Grapes", c = "Banana";
		FindMax.testMaximum(a, b, c);
		printMax(n);
		printMax(d);
	}

}