package com.clozarr.algoritmos.stack;

import java.util.Arrays;

import com.clozarr.algoritmos.collection.ICollection;
import com.clozarr.algoritmos.item.Item;


public class Stack<T> implements ICollection<T> {

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

	@Override
	public void push(T value) {

		if (!isFull()) {

			Item<T> item = new Item<T>(value);
			items[++index] = item;
			System.out.println("¡Item " + value + " added successfull!");

		} else {

			System.out.println("Failed add item " + value + ",  Stack is full!");
		}

	}
   
	@Override
	public void pop() {

		if (!isEmpty()) {

			System.out.println("¡Deleting item, " + items[index]);
			items[index--] = null;

		} else {

			System.out.println("¡Failed deleting item,  Stack is empty!");
		}

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if(!isEmpty())
			return (T) items[index];
		else
			System.out.println("¡Failed peek item, Stack is empty!");
		return null;
	}
	

	@Override
	public boolean isEmpty() {

		return this.count() == 0;
	}

	@Override
	public boolean isFull() {

		return this.count() == this.size();
	}

	@Override
	public int size() {

		return this.items.length;

	}

	@Override
	public int count() {

		return (this.index + 1);
	}
	
	@Override
	public void print() {
		
		Arrays.stream(items).filter(elemento -> elemento != null).forEach(System.out::println);
	}

}
