package ctci;

import static org.junit.Assert.*;

import org.junit.Test;

import ctci.LinkedListDetectCycle.Node;

public class LinkedListDetectCycleTest {

	@Test
	public void test() {
		Node head = createSomeNodes();
		assertTrue(new LinkedListDetectCycle().detectCycle(head));
	}

	public Node createSomeNodes() {
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
		fourthItem.next = head;
		return head;
	}

}
