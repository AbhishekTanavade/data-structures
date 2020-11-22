package com.abhishek.data.structures.stack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class Stack<T> implements Iterable<T> {
	private LinkedList<T> list = new LinkedList<>();
	
	public Stack() {	}
	
	public Stack(T firstElement) {
		push(firstElement);
	}
	
	public void push(T element) {
		this.list.addLast(element);
	}
	
	public int size() {
		return this.list.size();
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public T pop() {
		if(isEmpty())
			throw new EmptyStackException();
		return this.list.removeLast();
	}
	
	public T peek() {
		if(isEmpty())
			throw new EmptyStackException();
		return this.list.peekLast();
	}

	@Override
	public Iterator<T> iterator() {
		return this.list.iterator();
	}
}
