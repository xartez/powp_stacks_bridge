package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementation.StackList;

public class StackHanoi extends Stack implements IStack {

	public StackHanoi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackHanoi(StackList stackList) {
		super(stackList);
		// TODO Auto-generated constructor stub
	}

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}
	
	@Override
	public void push(int in) {
		if (!isEmpty() && in > top())
			totalRejected++;
		else
			super.push(in);
	}
}
