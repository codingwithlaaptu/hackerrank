package ctci;

public class LinkedList<T> {
	static class Node<T> {
		T value;
		Node<T> next;
	}

	private Node<T> head;
	private int count = 0;

	public LinkedList() {
		head = null;
	}

	public void addItem(T item) {
		++count;
		if (head == null) {
			head = new Node<T>();
			head.value = item;
			head.next = null;
		} else {
			Node<T> newNode = new Node<T>();
			newNode.value = item;
			newNode.next = null;
			Node<T> lastNode = getLastNode(head);
			lastNode.next = newNode;
		}
	}

	public int getCount() {
		return count;
	}

	public boolean removeItem(T item) {
		if (head != null) {
			if (head.value == item) {
				--count;
				head = head.next;
				return true;
			} else {
				return removeItem(item, head, head.next);
			}
		}
		return false;

	}

	private boolean removeItem(T item, Node<T> prevNode, Node<T> currentNode) {
		if (currentNode == null)
			return false;
		if (currentNode.value == item) {
			--count;
			prevNode.next = currentNode.next;
			return true;
		}
		return removeItem(item, currentNode, currentNode.next);
	}

	public boolean findItem(T value) {
		return findItem(head, value);
	}

	private boolean findItem(Node<T> node, T value) {
		if (node == null)
			return false;
		if (node.value == value)
			return true;
		return findItem(node.next, value);
	}

	public Node<T> getLastNode(Node<T> node) {
		if (node.next == null)
			return node;
		return getLastNode(node.next);
	}

}
