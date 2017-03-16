package edu.kis.vh.stacks;

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
public class StackArray {

	private static final int FULL_STACK_VALUE = 11;

	private static final int STACK_SIZE_VALUE = 12;

	private static final int EMPTY_STACK_VALUE = -1;

	private int[] items = new int[STACK_SIZE_VALUE];

	private int total = EMPTY_STACK_VALUE;
	

	public int getTotal() {
		return total;
	}
	
	//usunieto nieuzywane setTotal
	
	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	public boolean isEmpty() {
		return total == EMPTY_STACK_VALUE;
	}

	public boolean isFull() {
		return total == FULL_STACK_VALUE;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return items[total--];
	}

}
