package edu.kis.vh.nursery.list;

public class Node {

	private final int value;
	private Node prev;
	private Node next;

	public Node(int i) {
		value = i;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public int getValue() {
		return value;
	}

	// Jeśli masz metodę setValue(int value), to ją USUŃ.
	// Pole final nie może mieć settera, bo go nie nadpiszesz.
}