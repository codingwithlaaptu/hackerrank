package ctci;

public class LinkedListDetectCycle {
	static class Node {
		int data;
		Node next;
	}

	boolean hasCycle(Node head) {
		// return forcedSolution(100, head);
		return detectCycle(head);
	}

	/**
	 * This was done, as input range was between 0 to 100 This is not an
	 * efficient solution
	 */
	boolean forcedSolution(int count, Node head) {
		if (head == null)
			return false;
		--count;
		if (count <= 0)
			return true;
		return forcedSolution(count, head.next);
	}

	boolean detectCycle(Node head) {
		if (head == null)
			return false;
		Node slow = head;
		Node fast = head.next;
		while (true) {
			if (slow == fast)
				return true;
			if (slow == null || fast == null)
				return false;
			slow = slow.next;
			if (fast.next == null)
				return false;
			fast = fast.next.next;
		}
	}

}
