# 1. Insert a new Node at the head of the Single Linked List
Inserts a new element as the first element of the list. As head node always points to the first element of the list, insertion at head means that we are inserting the first element in the list.

## Time Complexity

O(1)

# 2. Insert a new Node at the end  of the Single Linked List
insert at the end of a linked list
## Time Complexity
This algorithm traverses the entire linked list, and hence, works in O(n) time.

# 3. Insertion in Singly Linked List (Insert After)
Sample Input #
linkedlist = 0->1->2->3->4 <br/>
data = 8
previous = 2 <br/>
Sample Output #<br/>
linkedlist = 0->1->2->8->3->

# 4. Search in Singly Linked List
boolean searchNode(T data)<br/>
Sample Input #
linkedlist = 5->90->10->4   and  value = 4 <br/>
Sample Output #<br/>
true

## Time Complexity #
The time complexity for this algorithm is O(n) because we have to traverse through the list.

# 5. Singly Linked List Deletion

Deletion is one of the instances where linked lists are more efficient than arrays. 
In an array, you have to shift all the elements backward if one element is deleted. 
Even then, the end of the array is empty and it takes up unnecessary memory.
In the case of linked lists, the node is removed merely in constant time.

a) Deletion at Head<br/>
b) Deletion by value

a) Deletion at Head #<br/>

   This operation simply deletes a node from the head of the list, which means that it always deletes the first element of the list. This type of deletion is used when your list is ordered, and you want to implement a priority queue–via a linked list-- to keep track of all the elements. Here’s an illustration of how this type of deletion works in a Singly Linked List:
 ## Time Complexity: <br/>
 The algorithm runs in O(1) since we’re deleting the first node of the list.
 
b) Deletion in Singly Linked List(Delete by Value) <br/>

Sample Input #<br/>
linkedlist = 3->2->1->0, 
data = 1
Sample Output # <br/>
linkedlist = 3->2->0

## Time Complexity #
  In the worst case, you would have to traverse until the end of the list. This means the time complexity will be O(n).
