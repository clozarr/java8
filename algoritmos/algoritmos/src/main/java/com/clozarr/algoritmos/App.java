package com.clozarr.algoritmos;

import java.util.Arrays;

import com.clozarr.algoritmos.ordenamiento.Ordenamiento;
import com.clozarr.algoritmos.queue.Queue;
import com.clozarr.algoritmos.recursividad.Recursividad;
import com.clozarr.algotirmos.stack.Stack;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		boolean sw = true;

		if (sw) {

			int[] elementos = { 1, 0, 8, 3, 6, 9, 4, 5, 2, 7 };
			elementos = Ordenamiento.insertionSort(elementos);
			Arrays.stream(elementos).forEach(System.out::print);
			System.out.println();
			System.out.println("Factorial de 5 es: " + Recursividad.factorial(5));

		} else {

			System.out.println("...:::: QUEUE ::::...");
			Queue<Integer> queue = new Queue<Integer>();
			System.out.println("Peek: " + queue.peek());
			queue.push(1);
			queue.push(2);
			queue.push(3);
			queue.pop();
			queue.print();
			queue.push(4);
			queue.print();
			System.out.println("Peek: " + queue.peek());
			System.out.println(".. .:::: STACK ::::...");
			Stack<Integer> stack = new Stack<>();
			System.out.println("Peek: " + stack.peek());
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.pop();
			stack.print();
			stack.push(40);
			stack.print();
			System.out.println("Peek: " + stack.peek());
		}

	}
}
