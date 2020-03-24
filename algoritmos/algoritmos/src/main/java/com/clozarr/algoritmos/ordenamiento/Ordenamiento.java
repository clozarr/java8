package com.clozarr.algoritmos.ordenamiento;

import java.util.Arrays;

public class Ordenamiento {

	/**
	 * BubbleSort iterative
	 * 
	 * @author carlos
	 */
	public static int[] bubbleSort(int[] items) {

		for (int j = 0; j < items.length; j++) {

			int mayor = 0;
			boolean swap = false;

			for (int i = 0; i < items.length - 1; i++) {

				if (items[i] > items[i + 1]) {

					// Realizamos swap (intercambio de posiciones)
					mayor = items[i];
					items[i] = items[i + 1];
					items[i + 1] = mayor;
					swap = true;

				}
			}
			/*
			 * Si no hay swap, quiere decir que el arreglo ya está ordenado, por lo tanto no
			 * es necesario seguir iterando
			 */
			if (!swap)
				break;

		}

		return items;

	}

	/**
	 * BubbleSort recursive
	 * 
	 * @author carlos
	 */
	public static int[] bubbleSort(int[] items, int arraySize) {

		if (arraySize == 1)
			return items;

		else {

			int mayor = 0;

			for (int i = 0; i < items.length - 1; i++) {

				if (items[i] > items[i + 1]) {

					mayor = items[i];
					items[i] = items[i + 1];
					items[i + 1] = mayor;
				}

			}

			return bubbleSort(items, arraySize - 1);
		}

	}

	public static int[] insertionSort(int[] items) {

		int menor = 0;
		for (int i = 1; i < items.length; i++) {

			for (int j = i; j > 0; j--) {

				if (items[j] < items[j - 1]) {

					menor = items[j];
					items[j] = items[j - 1];
					items[j - 1] = menor;

				}
			}
		}

		return items;

	}// Fin método
}
