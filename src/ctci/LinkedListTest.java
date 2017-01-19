package ctci;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < 5; ++i)
			linkedList.addItem(i);
		assertTrue(linkedList.getCount() == 5);
		assertTrue(linkedList.findItem(4));
		assertTrue(linkedList.findItem(0));
		assertFalse(linkedList.removeItem(10));
		assertTrue(linkedList.removeItem(3));
		assertTrue(linkedList.removeItem(4));
		assertFalse(linkedList.findItem(4));
		assertTrue(linkedList.getCount() == 3);
		linkedList.removeItem(0);
		linkedList.removeItem(1);
		assertTrue(linkedList.getCount() == 1);
		linkedList.removeItem(2);
		assertFalse(linkedList.findItem(2));
		assertFalse(linkedList.removeItem(2));
		assertTrue(linkedList.getCount() == 0);
		linkedList.addItem(10);
		assertTrue(linkedList.getCount() == 1);

	}

}
