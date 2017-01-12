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
    
4. Above 3 also can be looked in a different way 