package com.as.mitt.leetcode;

import java.util.Arrays;

import com.as.mitt.linkedlist.Node;

/*
 You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */

public class LinkedListSum {
	Node head;
	private void add(int data) {
		Node new_node = new Node(data);
		if (head == null) {
			head = new_node;
			return;
		}
		Node temp = head;
		while(temp.next !=null) {
			temp = temp.next;
		}
		temp.next = new_node;
	}
	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		
	}
	public static void main(String[] args) {
		LinkedListSum l1 = new LinkedListSum();
		l1.add(2);
		l1.add(4);
		l1.add(3);
		
		LinkedListSum l2 = new LinkedListSum();
		l2.add(5);
		l2.add(6);
		l2.add(4);
		
		LinkedListSum l3 = new LinkedListSum();
		l3 = l3.addTwoNumbers(l1, l2);
		l3.print();
		
	}
	public  LinkedListSum addTwoNumbers(LinkedListSum l1, LinkedListSum l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		int sum =0;
		StringBuilder b1 = new StringBuilder();
		Node temp = l1.head;
		while (temp!= null) {
			b1 = b1.append(temp.data);
			temp = temp.next;
		}
		sum  += Integer.parseInt(b1.reverse().toString());
		
		b1.setLength(0);
		temp = l2.head;
		while (temp!= null) {
			b1 = b1.append(temp.data);
			temp = temp.next;
		}
		sum  += Integer.parseInt(b1.reverse().toString());
		
		char [] array = (""+sum).toCharArray();
		
		LinkedListSum ans = new LinkedListSum();
		
		
		for (int i=array.length-1; i>=0; i--) {
			ans.add((int)Integer.parseInt((""+array[i])));
		}
		return ans;
	}
}

