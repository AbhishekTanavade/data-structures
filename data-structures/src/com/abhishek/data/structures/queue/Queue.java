package com.abhishek.data.structures.queue;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue<T> implements Iterable<T> {
	private LinkedList<T> list = new LinkedList<>();
	
	public Queue() {	}
	
	public Queue(T firstElement) {
		offer(firstElement);
	}
	
	public int size() {
		return this.list.size();
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public T peek() {
		if(isEmpty())
			throw new RuntimeException("Queue is empty!");
		return this.list.peekFirst();
	}
	
	public T poll() {
		if(isEmpty())
			throw new RuntimeException("Queue is empty!");
		return this.list.removeFirst();
	}
	
	public void offer(T element) {
		if(element == null)
			throw new RuntimeException("Element cannot be null!");
		this.list.addLast(element);
	}

	@Override
	public Iterator<T> iterator() {
		return this.list.iterator();
	}
}
