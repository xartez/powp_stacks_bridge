package edu.kis.vh.stacks.implementation;

public class Node {

	private int value; // pozostale klasy korzystajace z atrybutu zaczely odnosić się do niego za pomocą getterów i setterów
	private Node prev; // jw.
	private Node next; // jw.

	public Node(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	// usunieto niewykorzystywane setValue()

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

}
