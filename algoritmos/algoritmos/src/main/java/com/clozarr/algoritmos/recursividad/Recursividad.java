package com.clozarr.algoritmos.recursividad;

public class Recursividad {

	public static long factorial(int number) {

		if (number == 0)
			return 1;
		else
			return number * factorial(number - 1);
	}

}
