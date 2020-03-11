package com.clozarr.algoritmos.queue;

public class Item<T> {

	private T value;

	public Item(T value) throws IllegalArgumentException {

		if (value != null) {

			this.setValue(value);

		} else {

			throw new IllegalArgumentException("the value cannot be NULL");
		}
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Value is: " + this.value;
	}
}
