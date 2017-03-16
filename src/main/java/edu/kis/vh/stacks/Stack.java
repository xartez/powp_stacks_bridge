package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

/**
 * @author Jakub
 *
 * public int getTotal()
 * 	zwraca liczbe elementow przechowywanych na stosie
 * 
 * public void push(int i)
 * 	odpowiada za dodanie elementu przekazanym przez parametr do stosu
 * 
 * public boolean isEmpty()
 * 	sprawdza czy stos przechowuje jakies elementy, jezeli stos jest pusty zwraca EMPTY_STACK_VALUE = -1
 * 
 * public boolean isFull() 
 *	sprawdza czy stos jest pełny, jeżeli stos jest pełen zwraca FULL_STACK_VALUE = 11
 *
 * public int top() 
 * 	zwraca element ze szczytu listy, jezeli stos jest pusty EMPTY_STACK_VALUE = -1
 * 
 * public int pop()
 *	uswa element ze stosu i zwraca tablice bez usuniętego elementu, jezeli stos jest pusty EMPTY_STACK_VALUE = -1
 *
 *
 * Generalnie dażymy do tego by kod był na tyle czytelny aby nie było konieczności pisać takiej zbednej dokumentacji.
 * 
 */
public class Stack {


	//private stackList stackList = new stackList();
	private StackList stackList = new StackList();
	public Stack() {
		this.stackList = new StackList();
	}

	public Stack(StackList stackList) {
		super();
		this.stackList = stackList;
	}


/*	public int getTotal() {
		return stackList.getTotal();
	}*/

	public void push(int i) {
		stackList.pushElement(i);
	}

	public boolean isEmpty() {
		return stackList.empty();
	}

	public boolean isFull() {
		return stackList.full();
	}

	public int top() {
		return stackList.peek();
	}

	public int pop() {
		return stackList.pop();
	}
	



}
