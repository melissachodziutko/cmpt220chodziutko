public class stackOfIntegers {
	private int[] numbers;
	private int size;
	public static final int cap = 16;

	//stack with default amount max of 16
	public stackOfIntegers() {
		this (cap);
	}

	//new stack with specified capacity
	public stackOfIntegers(int capacity) {
		numbers = new int[capacity];
	}

	//put new integer at top of stack
	public void smallest(int value) {
		if (size >= numbers.length) {
			int[] temp = new int[numbers.length * 2];
			System.arraycopy(numbers, 0, temp, 0, numbers.length);
			numbers = temp;
		}

		numbers[size++] = value;
	}

	//remove top of stack
	public int removetop() {
		return numbers[--size];
	}

	//bring back top
	public int returnTop() {
		return numbers[size - 1];
	}

	//empty stack
	public boolean empty() {
		return size == 0;
	}

	//return stack
	public int size() {
		return size;
	}
}