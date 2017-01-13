There are two concept regarding Arrayleft Rotation


* Array Item Left Shift
* Array left shift ( which is simply array item left shift * n times)

What concepts are there in array left rotation 

1. Any item left rotated or shifted can't go beyond the length of the array. { 1,2,3,4} this is an array of length 4 and if we have to left shift each items by 90, then also it can't exceed the length of array. Simply say, these items can't go beyond the container.
2. The above exposes one of the cool property of mathematics. The remainder from division by n can't exceed n. Meaning 90%4 < 4, 90%4 ==2 < 4.
3. Say we have to shift {1,2,3,4} each item by 90, then 

    0+90 = 90, 90%4 = 2
    
    1+90 = 90, 91%4 = 3
    
    2+90  = 92, 92%4 = 0
    
    3+90 = 93 , 93%4 = 1
    
    So the new indices by shift of 90 will be
    
    a[0] = 1,  a[2] =1
 
    a[1] = 2,  a[3] =2
    
    a[2] = 3 ,  a[0] = 3
    
    a[3] = 4,  a[1] = 4
    
    {1,2,3,4} = {3,4,1,2}
    
4. Above 3 also can be looked in a different way, if any items are left rotated by the size of array, it will end up in the same position. Here size of array is 4, so any multiple of 4 will wound up the item in the same position

![Left Rotation Item](https://github.com/codingwithlaaptu/hackerrank/blob/master/pics/ArrayLeftRotation.png) 

These are the basics of left shift of items. But in the [question](https://www.hackerrank.com/challenges/ctci-array-left-rotation), it is asking to shift the array

![Left Rotation Item](https://github.com/codingwithlaaptu/hackerrank/blob/master/pics/array_left_rotation_example.png)

Solution: I found the solution from pattern, instead of any property. In the example above in the final array we only see, there is 1 left shift of item

array size = 5

shift value = 4

final array item shift = 1 ( 5-4)

I validated the same with other examples and it came accurate.

```
static String input1 = "41 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51";
static String output1 = "77 97 58 1 86 58 26 10 86 51 41 73 89 7 10 1 59 58 84 77";
static int shift1 = 10;
int arraysize = 20
```		 

So in the above example also the shift  = 10 (20-10)

I tested all of these hypothesis and it worked. The core concept of this working is still yet to be found. 
		   


