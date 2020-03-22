package com.clozarr.algotirmos.stack;

import java.util.Arrays;

import com.clozarr.algotirmos.item.Item;


public class Stack<T> {

	private Item<T> items[];
	private static int DEFAULT_SIZE = 3;
	private int index = -1;

	@SuppressWarnings("unchecked")
	public Stack(int size) {

		items = new Item[size];
	}

	public Stack() {

		this(DEFAULT_SIZE);
	}

	public void push(T value) {

		if (!isFull()) {

			Item<T> item = new Item<T>(value);
			items[++index] = item;
			System.out.println("¡Item " + value + " added successfull!");

		} else {

			System.out.println("Failed add item " + value + ",  Stack is full!");
		}

	}

	public void pop() {

		if (!isEmpty()) {

			System.out.println("¡Deleting item, " + items[index]);
			items[index--] = null;

		} else {

			System.out.println("¡Failed deleting item,  Stack is empty!");
		}

	}

	public boolean isEmpty() {

		return this.count() == 0;
	}

	public boolean isFull() {

		return this.count() == this.size();
	}

	public int size() {

		return this.items.length;

	}

	public int count() {

		return (this.index + 1);
	}
	
	public void printStack() {
		
		Arrays.stream(items).filter(elemento -> elemento != null).forEach(System.out::println);
	}

}
