package edu.kis.vh.stacks;

public interface IStack {

	public static final int EMPTY_STACK_INDICATOR = -1;
	
	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();
	
	//3.1.11 dzieki wydelegowaniu stalej dokonalem zmiany tylko w jednym pliku zamiast dwoch

}