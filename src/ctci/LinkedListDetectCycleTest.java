package ctci;

import static org.junit.Assert.*;

import org.junit.Test;

import ctci.LinkedListDetectCycle.Node;

public class LinkedListDetectCycleTest {

	@Test
	public void test() {
		assertTrue(new LinkedListDetectCycle().hasCycle(createCycleNode()));
		assertFalse(new LinkedListDetectCycle().hasCycle(null));
		assertFalse(new LinkedListDetectCycle().hasCycle(createNonCycleNode()));
		assertTrue(new LinkedListDetectCycle().hasCycle(createLongCycleNode(true)));
		assertFalse(new LinkedListDetectCycle().hasCycle(createLongCycleNode(false)));
	}

	public Node createCycleNode() {
		Node head = new Node();
		head.data = 1;
		Node secondItem = new Node();
		secondItem.data = 2;
		Node thirdItem = new Node();
		thirdItem.data = 3;
		Node fourthItem = new Node();
		fourthItem.data = 4;
		Node fifthItem =new Node();
		fifthItem.data = 5;

		head.next = secondItem;
		secondItem.next = thirdItem;
		thirdItem.next = fourthItem;
		fourthItem.next = fifthItem;
		fifthItem.next = secondItem;
		return head;
	}

	public Node createNonCycleNode() {
		Node head = new Node();
		head.data = 1;
		Node secondItem = new Node();
		secondItem.data = 2;
		Node thirdItem = new Node();
		thirdItem.data = 3;
		Node fourthItem = new Node();
		fourthItem.data = 4;

		head.next = secondItem;
		secondItem.next = thirdItem;
		thirdItem.next = fourthItem;
		fourthItem.next = null;
		return head;
	}

	public Node createLongCycleNode(boolean create) {
		Node head = new Node();
		head.data = 0;
		Node otherNode = new Node();
		otherNode.data = 1;
		otherNode.next = null;
		head.next = otherNode;
		for (int i = 2; i < 99; ++i) {
			Node node = new Node();
			node.data = i;
			otherNode.next = node;
			otherNode = node;
		}
		if (create)
			otherNode.next = head;
		return head;
	}

}
