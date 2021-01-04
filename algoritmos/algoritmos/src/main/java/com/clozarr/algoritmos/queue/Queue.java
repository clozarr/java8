package com.clozarr.algoritmos.queue;

import java.util.Arrays;

import com.clozarr.algoritmos.collection.ICollection;
import com.clozarr.algoritmos.item.Item;

public class Queue<T> implements ICollection<T> {

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

	@Override
	public void push(T value) {

		if (!isFull()) {

			Item<T> item = new Item<T>(value);
			items[++index] = item;
			System.out.println("¡Item " + value + " added successfull!");
		} else {

			System.out.println("Failed add item " + value + ",  Queue is full!");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if (!isEmpty())
			return (T) items[0];
		else
			System.out.println("¡Failed peek item, Queue is empty!");
		return null;
	}

	@Override
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

	@Override
	public boolean isFull() {

		return this.count() == this.size();
	}

	@Override
	public boolean isEmpty() {

		return this.count() == 0;
	}

	@Override
	public int size() {

		return items.length;
	}

	@Override
	public int count() {

		return (this.index + 1);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		Arrays.stream(this.items).filter(element -> element != null).forEach(System.out::println);
	}

}
