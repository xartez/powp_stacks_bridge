package edu.kis.vh.stacks;

import edu.kis.vh.stacks.implementation.StackList;

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
	// 3.1.7 implementacja metod zostala zastapiona delegacja do interfejsu 

	//private stackList stackList = new stackList();
	private IStack iStack = new StackList();
	public Stack() {
		this.iStack = new StackList();
	}

	public Stack(StackList stackList) {
		super();
		this.iStack = stackList;
	}

	public void push(int i) {
		iStack.push(i);
	}

	public boolean isEmpty() {
		return iStack.isEmpty();
	}

	public boolean isFull() {
		return iStack.isFull();
	}

	public int top() {
		return iStack.top();
	}

	public int pop() {
		return iStack.pop();
	}

	// F3 otwiera deklaracje metod w interfejsie, Open Hierarchy (CTRL+T) wyswietla interfejsy i klasy implementujace metody, CTRL+Kursor pozwala otworzyc miejsce deklaracji lub implementacji metody 

	



}
