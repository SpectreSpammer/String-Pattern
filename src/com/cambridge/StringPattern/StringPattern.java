package com.cambridge.StringPattern;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class StringPattern {

	public static void SortChar (char str[], int x) {
		
		HashSet<Character> chr = new LinkedHashSet<>(x - 1);
		
		for ( char i : str) {
			chr.add(i);
		}
		
		for ( char i : chr) {
			System.out.print(i);
		}
		
	}
	
	public static void main(String[] args) {
		
		char str[] = "abcabcabc".toCharArray();
		int x = str.length;
		SortChar(str, x);
		
		System.out.println();
		
		char str2[] = "xyzxyz".toCharArray();
		int x2 = str.length;
		SortChar(str2, x2);
		
		System.out.println();
		
		//hashset doesn't allow repetitive string so it will only print upto abcde and the rest will be ignore
		char str3[] = "abcdeabcd".toCharArray();
		int x3 = str.length;
		SortChar(str3, x3);
		
		System.out.println();
		
		char str4[] = "aaa".toCharArray();
		int x4 = str.length;
		SortChar(str4, x4);
		
		System.out.println();
		
		char str5[] = "aeiou".toCharArray();
		int x5 = str.length;
		SortChar(str5, x5);
		
		System.out.println();
		
	}

}
