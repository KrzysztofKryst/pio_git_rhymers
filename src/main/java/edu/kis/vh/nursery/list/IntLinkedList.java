package edu.kis.vh.nursery.list;


/**
 * Klasa reprezentująca stos oparty na liście dwukierunkowej (linked list).
 */
public class IntLinkedList {
	
	/**
	 * Wewnętrzna klasa reprezentująca pojedynczy węzeł listy.
	 */
	private class Node {

		private final int value;
		private Node prev;
		private Node next;

		/**
		 * Tworzy nowy węzeł z wartością i.
		 * @param i wartość węzła
		 */
		public Node(int i) {
			this.value = i;
		}

		/**
		 * Zwraca następny węzeł w liście.
		 * @return referencja do następnego węzła, lub null jeśli brak
		 */
		Node getNext() {
			return next;
		}

		/**
		 * Ustawia następny węzeł.
		 * @param next węzeł, który stanie się następnym
		 */
		void setNext(Node next) {
			this.next = next;
		}

		/**
		 * Zwraca poprzedni węzeł w liście.
		 * @return referencja do poprzedniego węzła.
		 */
		Node getPrev() {
			return prev;
		}

		/**
		 * Ustawia poprzedni węzeł.
		 * @param prev węzeł, który stanie się poprzednim
		 */
		void setPrev(Node prev) {
			this.prev = prev;
		}

		/**
		 * Zwraca wartość przechowywaną w węźle.
		 * @return wartość typu int
		 */
		int getValue() {
			return value;
		}

	}

	private Node last;
	private int i;

    /**
     * Dodaje nowy element na szczyt stosu.
     * @param i wartość do dodania
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Sprawdza, czy stos jest pusty.
     * @return true jeśli stos nie zawiera elementów, false w przeciwnym wypadku
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     * @return false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Zwraca wartość elementu na szczycie stosu, bez zdejmowania go.
     * @return wartość szczytowego elementu lub -1 jeśli stos jest pusty
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    /**
     * Zdejmuje element ze szczytu stosu i zwraca jego wartość.
     * @return wartość ostatniego elementu lub -1 jeśli stos jest pusty
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
