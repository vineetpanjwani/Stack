package main.java;

/**
 * The Class Stack.
 */
public class Stack {

	/** The capacity. */
	protected int capacity;
	
	/** The index. */
	protected int index = -1;
	
	/** The Constant CAPACITY. */
	public static final int CAPACITY = 10;
	
	/** The stack rep. */
	protected int[] stackRep;

	/**
	 * Instantiates a new stack.
	 */
	public Stack() {
		this(CAPACITY);
	}

	/**
	 * Instantiates a new stack.
	 *
	 * @param cap the cap
	 */
	public Stack(int cap) {
		capacity = cap;
		stackRep = new int[capacity];
	}

	/**
	 * Top.
	 *
	 * @return the int
	 * @throws Exception the exception
	 */
	private int top() throws Exception {
		return index + 1;
	}

	/**
	 * Checks if stack is empty.
	 *
	 * @return true, if is empty
	 */
	private boolean isEmpty() {
		return (index < 0);
	}

	/**
	 * Push.
	 *
	 * @param data the data
	 * @throws Exception the exception
	 */
	public void push(int data) throws Exception {
		if (top() == capacity) {
			throw new Exception("Stack is Full");
		}
		stackRep[++index] = data;
	}

	/**
	 * Pop.
	 *
	 * @return the int
	 */
	public int pop() throws Exception{
		int data = 0;
		if(isEmpty()) {
			throw new Exception("Stack is Empty. Nothing to pop");
		}
		data = stackRep[index];
		stackRep[index--] = Integer.MIN_VALUE;
		return data;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String output = "";
		for (int value : stackRep) {
			output += value + ", ";
		}
		System.out.println(output);
		return output;
	}
	
	public int peek() {
		return -1;
	}
	
	public int search(int data) {
		return -1;
	}
	

}
