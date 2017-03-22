package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.StackListFactory;

// kombinacja alt + <- i alt + -> kieruje cie kolejna wstecz lub do przodu ostatnio odwiedzonych linii w kazdym pliku  
public class StackTest {

	@Test
	public void testStackArrayPush() {
		ArrayStacksFactory arrayStacksFactory = new ArrayStacksFactory();
		Stack stackObj = arrayStacksFactory.getStandardStack();
		int testValue = 4;
		stackObj.push(testValue);
		
		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testStackArrayIsEmpty() {
		ArrayStacksFactory arrayStacksFactory = new ArrayStacksFactory();
		Stack stackObj = arrayStacksFactory.getStandardStack();
		boolean result = stackObj.isEmpty();		
		Assert.assertEquals(true, result);
		
		stackObj.push(888);
		
		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testStackArrayIsFull() {
		ArrayStacksFactory arrayStacksFactory = new ArrayStacksFactory();
		Stack stackObj = arrayStacksFactory.getStandardStack();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();		
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}
		
		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
		// zmiany w tescie: test sprawdza dzialanie metody isFull() dla stosu implementujacego StackArray
	}

	@Test
	public void testStackArrayTop() {
		ArrayStacksFactory arrayStacksFactory = new ArrayStacksFactory();
		Stack stackObj = arrayStacksFactory.getStandardStack();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testStackArrayPop() {
		ArrayStacksFactory arrayStacksFactory = new ArrayStacksFactory();
		Stack stackObj = arrayStacksFactory.getStandardStack();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
}
	

	
	@Test
	public void testFIFOPop() {
		StackFIFO stackObj = new StackFIFO();
		final int EMPTY_STACK_VALUE = -1;

		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);

		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
	
	@Test
	public void testHanoiPush() {
		StackHanoi stackObj = new StackHanoi();
		int testValue = 4;
		stackObj.push(testValue);

		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}
// zmiana stalej wskazujacej, ze stos jest pusty (podpunkt 11) spowodowala zakonczenie niektorych testow niepowodzeniem 

	
	@Test
	public void testStackListPush() {
		StackListFactory stackListFactory = new StackListFactory();
		Stack stackObj = stackListFactory.getStandardStack();
		int testValue = 4;
		stackObj.push(testValue);
		
		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testStackListIsEmpty() {
		StackListFactory stackListFactory = new StackListFactory();
		Stack stackObj = stackListFactory.getStandardStack();
		boolean result = stackObj.isEmpty();		
		Assert.assertEquals(true, result);
		
		stackObj.push(888);
		
		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testStackListIsFull() {
		StackListFactory stackListFactory = new StackListFactory();
		Stack stackObj = stackListFactory.getStandardStack();
		final int TEST_STACKLIST_SIZE = 100;
		
		boolean result = stackObj.isFull();		
		Assert.assertEquals(false, result);
		
		for (int i = 0; i < TEST_STACKLIST_SIZE; i++) {
			stackObj.push(888);
		}
		
		result = stackObj.isFull();
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testStackListTop() {
		StackListFactory stackListFactory = new StackListFactory();
		Stack stackObj = stackListFactory.getStandardStack();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testStackListPop() {
		StackListFactory stackListFactory = new StackListFactory();
		Stack stackObj = stackListFactory.getStandardStack();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
}
}
