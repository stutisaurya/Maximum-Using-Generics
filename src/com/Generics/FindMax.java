package com.Generics;

public class FindMax {
	public <T extends Comparable<T>> T maxOfAnything(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		FindMax m = new FindMax();
		System.out.println(m.maxOfAnything(10, 23, 15));
		System.out.println(m.maxOfAnything(12.5, 13.4, 22.0));
		System.out.println(m.maxOfAnything("Apple", "Grapes", "Banana"));
	}
}
