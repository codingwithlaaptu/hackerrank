package ctci;

import java.util.HashSet;
import java.util.Set;

public class LinkedListDetectCycle {
	static class Node {
		int data;
		Node next;
	}

	boolean hasCycle(Node head) {
		boolean hasCycle = detectCycle(head);
		set.clear();
		return hasCycle;
	}

	Set<Integer> set = new HashSet<>();

	boolean detectCycle(Node head) {
		if (head == null)
			return false;
		System.out.println("Head data " + head.data);
		if (set.contains(head.data))
			return true;

		set.add(head.data);
		return detectCycle(head.next);
	}
}
