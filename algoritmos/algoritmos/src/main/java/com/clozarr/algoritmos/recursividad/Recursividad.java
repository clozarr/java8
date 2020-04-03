package com.clozarr.algoritmos.recursividad;

public class Recursividad {

	public static long factorial(int number) {

		if (number == 0)
			return 1;
		else
			return number * factorial(number - 1);
	}
	
	public static String reverseString(String str) {
		
		if(str.isEmpty()) {
			
			return str;
		}else {
			
			return reverseString(str.substring(1)) + str.charAt(0);
		}
		
		
	}

}
