package com.clozarr.algoritmos.ordenamiento;

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

	/*
	 * InsertionSort
	 * 
	 * @author carlos
	 */
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

	/*
	 * QuickSort
	 *
	 **/
	public static int[] quickSort(int[] items) {
		return items;
	}

	/*
	 * Selection Sort Iterative
	 **/
	public static int[] selectionSort(int[] items) {

		int swapElement = 0;
		for (int i = 0; i < items.length; i++) {

			int indexMenor = i;

			for (int j = (i + 1); j < items.length; j++) {

				if (items[indexMenor] > items[j]) {

					indexMenor = j;

				}
			}

			swapElement = items[i];
			items[i] = items[indexMenor];
			items[indexMenor] = swapElement;

		}

		return items;
	}

	/*
	 * Selection Sort recursive
	 **/
	public static int[] selectionSort(int[] items, int initialIndexArray) {

		if (initialIndexArray == (items.length - 1)) {

			return items;

		} else {

			int swapElement = 0;

			int indexMenor = initialIndexArray;

			for (int j = (initialIndexArray + 1); j < items.length; j++) {

				if (items[indexMenor] > items[j]) {

					indexMenor = j;

				}
			}

			swapElement = items[initialIndexArray];
			items[initialIndexArray] = items[indexMenor];
			items[indexMenor] = swapElement;

			return selectionSort(items, initialIndexArray + 1);
		}
	}

}
