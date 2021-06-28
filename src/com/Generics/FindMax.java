package com.Generics;

public class FindMax {
	public static int checkMaximum(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static Double checkMaximum(Double d, Double e, Double f) {
		Double max = d;
		if (e.compareTo(max) > 0) {
			max = e;
		}
		if (f.compareTo(max) > 0) {
			max = f;
		}
		return max;
	}

	public static String checkMaximum(String s1, String s2, String s3) {
		String max = s1;
		if (s2.compareTo(max) > 0) {
			max = s2;
		}
		if (s3.compareTo(max) > 0) {
			max = s3;
		}
		return max;
	}

	public static void main(String[] args) {

		int c = checkMaximum(10, 23, 15);
		Double d = checkMaximum(12.5, 13.4, 22.0);
		String s = checkMaximum("Apple", "Grapes", "Banana");
		System.out.println("The Maximum int value is : " + c);
		System.out.println("The Maximum float value is : " + d);
		System.out.println("The Maximum String value is : " + s);
	}

}
