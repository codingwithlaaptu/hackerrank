package ctci;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SmallTest {

	public static void main(String[] args) {
		//setTest();
		stringContainTest();
	}

	public static void linkedListTest() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.addItem(10);
	}

	public static void setTest() {
		Set<Integer> someSet = new HashSet<Integer>();
		someSet.add(10);
		someSet.add(11);
		someSet.add(10);
		someSet.add(9);
		someSet.add(18);
		Iterator<Integer> iterator = someSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void stringContainTest(){
		String someValue =",2,12";
		System.out.println(someValue.contains("1"));
	}

}
