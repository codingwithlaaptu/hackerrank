[Question](https://www.hackerrank.com/challenges/ctci-linked-list-cycle)

Solution

1. Cyclic = FALSE
![cyclic false](https://github.com/codingwithlaaptu/hackerrank/blob/master/pics/cyclic_false.png)

2. Cyclic = TRUE
![cyclic true](https://github.com/codingwithlaaptu/hackerrank/blob/master/pics/cyclic_true.png) 

3. Cyclic = TRUE
![cyclic true again](https://github.com/codingwithlaaptu/hackerrank/blob/master/pics/cyclic_true_again.png)
````
/**
* Taken from  a solution at hackerrank
* https://goo.gl/dyTXvE
*/
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
````