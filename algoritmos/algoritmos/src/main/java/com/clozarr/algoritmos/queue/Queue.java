package com.clozarr.algoritmos.queue;

import java.util.Arrays;

import com.clozarr.algotirmos.item.Item;

public class Queue<T> {

	private Item<T> items[] = null;
	private static int DEFAULT_SIZE = 3;
	private int index = -1;
	private int pointer = 0;

	@SuppressWarnings("unchecked")
	public Queue(int size) {

		items = new Item[size];
	}

	public Queue() {

		this(DEFAULT_SIZE);
	}

	public void push(T value) {

		if (!isFull()) {

			Item<T> item = new Item<T>(value);
			items[++index] = item;
			System.out.println("¡Item " + value + " added successfull!");
		} else {

			System.out.println("Failed add item " + value + ",  Queue is full!");
		}

	}

	public void pop() {

		if (!isEmpty()) {

			System.out.println("Deleting item, " + items[pointer]);

			while (pointer < index) {

				Item<T> item = items[++pointer];
				items[pointer - 1] = item;

			}

			items[pointer] = null;
			pointer = 0;
			index--;

		} else {

			System.out.println("¡Failed deleting item,  queue is empty!");
		}
	}

	public boolean isFull() {

		return this.count() == this.size();
	}

	public boolean isEmpty() {

		return this.count() == 0;
	}

	public int size() {

		return items.length;
	}

	public int count() {

		return (this.index + 1);
	}

	public void printQueue() {
		// TODO Auto-generated method stub
		Arrays.stream(this.items).filter(element -> element != null).forEach(System.out::println);
	}

}
