package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY_VALUE = -1;
    public static final int FULL = 11;
    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public int getTotal() {
		return total;
	}

	public boolean callCheck() {
        return total == EMPTY_VALUE;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaBoo() {
        if (callCheck())
            return EMPTY_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_VALUE;
        return numbers[total--];
    }

}
