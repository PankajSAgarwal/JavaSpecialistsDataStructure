#Problem Statement
In this problem, you have to implement the int[] findSum(int[] arr, int n) function which will take a number n and an array arr as an input and returns two integers that add up to n in an array.

## Function Prototype
int[] findSum(int[] arr, int n)

#Output
An array with two integers a and b that add up to a certain number.

##Sample Input
arr = {1, 21, 3, 14, 5, 60, 7, 6}
value = 27

##Sample Output
arr = {21, 6} or {6, 21}

# Solution1 - Brute Force

Traverse the whole array of the given size. For each element in an array, check if any of the two elements add up to the given number n. Use a nested for-loop for this purpose and iterate over the entire array for each element.

Time Complexity - O(n^2)</b>

# Solution 2- Sorting the array using Quick sort
A better way to solve this is by first sorting the array. Here,QuickSort is used to sort the array first. Then using two variables, one starting from the first index of the array and second from size-1 index of the array. If the sum of the elements on these indexes of the array is smaller than given value n then increment index from the start else decrement index from the end, until the given value n is equal to the sum. Store the elements on these indexes in result array and return it.

<b> Time Complexity - O(nlogn)</b>

Since the sorting function use in this code takes O(nlog n). The algorithm takes O(n) times. So, the overall time complexity of this code is O(nlogn).

# Solution 3- Using HashSet

We solve this problem by using a HashSet called set. For every element in the arr array, the difference of key & each element (n-arr[i]) is computed. If it’s not already present in the set, this value is added and index moves to the next element of the array.
As soon as the difference of value stored in set becomes equal to any value in the array arr, the 2 numbers adding up to n are found!

Therefore, an array of size 2 called result is created to store the pair that sums up to ‘n’. If Hash-Set contains an array element, result[] is updated, or else it is returned containing the default value.

Time Complexity
This code works in O(n) as the whole array is iterated over once.


