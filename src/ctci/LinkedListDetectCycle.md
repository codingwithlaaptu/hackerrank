[Question](https://www.hackerrank.com/challenges/ctci-linked-list-cycle)

Solution

1. Cyclic = FALSE
![cyclic false](https://github.com/codingwithlaaptu/hackerrank/blob/master/pics/cyclic_false.png)

2. Cyclic = TRUE
![cyclic true](https://github.com/codingwithlaaptu/hackerrank/blob/master/pics/cyclic_true.png) 

3. Cyclic = TRUE
![cyclic true again](https://github.com/codingwithlaaptu/hackerrank/blob/master/pics/cyclic_true_again.png)

#### Main logic
![logic](https://github.com/codingwithlaaptu/hackerrank/blob/master/pics/cyclic_logic.png)

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
			if (slow == null || fast == null || fast.next ==null)
				return false;
			slow = slow.next;
			fast = fast.next.next;
		}
}
````

#### Code visualization
[Linked List 1 -4, cyclic = false ](https://goo.gl/dF41ix)

![false cyclic](https://github.com/codingwithlaaptu/hackerrank/blob/master/pics/cyclic_false_1_4.png))

[Linked List 1-8, 8 points to 4, cyclic = true](https://goo.gl/20s5T4)

![true cyclic](https://github.com/codingwithlaaptu/hackerrank/blob/master/pics/cyclic_true_1_8.png))

[Linked List 1-4, 4 points to 1, cyclic = true](https://goo.gl/AgkHmy)

![true cyclic](https://github.com/codingwithlaaptu/hackerrank/blob/master/pics/cyclic_true_1_4.png))