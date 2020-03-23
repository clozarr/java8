package com.clozarr.algoritmos.collection;

public interface ICollection<T> {

	void push(T element);
	void pop();
	T peek();
	void print(); 
	boolean isFull();
	boolean isEmpty();
	int count();
	int size();
	
	
}
