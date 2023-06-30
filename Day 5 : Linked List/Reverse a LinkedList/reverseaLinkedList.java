https://www.codingninjas.com/studio/problems/799897?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTab=0
import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		LinkedListNode prev = null;
		LinkedListNode curr = head;
		LinkedListNode next = null;
		while(curr!=null){
			next = curr.next;		//store next node
			curr.next = prev;		//shift curr's pointer to previous node( in start it's null)
			prev=curr;				//store the curr node as previous node ( for assigning pointer later)
			curr=next;				//shift forward in operation
		}	
			return prev;
    }
}
