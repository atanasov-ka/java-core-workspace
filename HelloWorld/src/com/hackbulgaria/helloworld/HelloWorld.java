package com.hackbulgaria.helloworld;

import java.util.Arrays;

/*
8. Smallest multiple

long getSmallestMultiple(int upperBound);

Find the smallest (positive) number, that can be divided by each of the numbers from 1 to upperBound.
=====================================
9. Find the largest integer palindrome number up to N

long getLargestPalindrome(long N);

1234321 is a palindrome. You are given a number => N. Find the largest number < N, that is a palindrome.

Bonus do this without using Collections.sort
=====================================

10. Grayscale image histogram
int[] histogram(short[][] image)
A histogram is a representation of distribution of some data.
Here you receive a grayscale image matrix (image). Each of the matrix's values will be between 0 and 255. Return an array result, which is a histogram of image => the value of result[i] should be the ammount of times i is in the matrix image.

 */
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println(isOdd(5));
		System.out.println(min(5, -4, 1, 2, 9, 2, 43, 123, -435));
		System.out.println(kthMin(1, new int []{ 5, -4, 1, 2, 9, 2, 43, 123, -435}));
		System.out.println(getAverage(new int []{ 5, -4, 1, 2, 9, 2, 43, 123, -435}));
		System.out.println(doubleFac(3));
		System.out.println(kthFac(2, 3));
		System.out.println(isPrime(9));
	}

	static boolean isOdd(int n) {
		return n % 2 == 1;
	}

	static int min(int... array) {
		return kthMin(0, array);
	}

	static int kthMin(int k, int[] array) {
		Arrays.sort(array);
		return array[k];
	}

	static int getAverage(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum / array.length;
	}

	public static boolean isPrime(int N) {
		if (N < 2)
            return false;
 
        int sqrtBorder = (int)Math.round(Math.sqrt(N));
        for (int i = 2; i <= sqrtBorder; ++i)
        {
            if (N % i == 0)
            {
                return false;
            }
        }
        return true;
	}

	public static long fac(int n) {
		long result = 1;
		for (int i = n; i > 1; --i) {
			result *= i;
		}
		return result;
	}

	public static long doubleFac(int n) {
		return kthFac(2, n);
	}

	public static long kthFac(int k, int n) {
		long result = n;
		for (int i = 1; i <= k; ++i) {
			result = fac((int) result);
		}
		return result;
	}
	
	public static int[] histogram(short[][] image) {
		int [] result = new int[256];
		for (int i = 0; i < image.length; ++i) {
			for (int j = 0; j < image[i].length; ++j ) {
				++result[image[i][j]];
			}
		}
			
		return result;
	}
}
