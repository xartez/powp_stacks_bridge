package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementation.StackList;

public class StackFIFO extends Stack implements IStack {

	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackFIFO(StackList stackList) {
		super(stackList);
		// TODO Auto-generated constructor stub
	}

	private Stack temp = new Stack();

	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());

		int ret = temp.pop();

		while (!temp.isEmpty())
			push(temp.pop());

		return ret;
	}
}
