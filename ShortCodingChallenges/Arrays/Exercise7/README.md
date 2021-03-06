#Problem Statement

Given an array of size n, can you find the second maximum element in the array? 
Implement your solution in Java and see if your output matches the correct output!

# Function Prototype #
int findSecondMaximum(int[] arr)

# Sample Input #
arr = {9,2,3,6}
# Sample Output #
6

#Solution 1 - Travesring the array twice

We traverse the array twice. In the first traversal, we find the maximum element. In the second traversal find the greatest element less than the element obtained in the first traversal.

#Time Complexity 
 
 O(n) + O(n) = O(n)
 
# Solution 2 - Traversing the array once 

We initialize two variables max and secondmax to Integer.MIN_VALUE having value -2147483648 which is the maximum integer negative value range.
We then traverse the array, and if the current element in the array is greater than the maximum value, then set secondmax to max
and max to the current element. If the current element is greater than the secondmax but less than max, then update secondmax
to store the value of the current element. Finally, return the value stored in secondmax.

## Time Complexity
O(n) since we travers the array once .
