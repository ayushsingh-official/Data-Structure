package ds_LinkedList;

public class AddTwoNumbersOfList {

	public static void main(String[] args) {

		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(2);
		head1.next.next = new ListNode(9);

		ListNode head2 = new ListNode(5);
		head2.next = new ListNode(6);
		head2.next.next = new ListNode(3);

		ListNode sum = sumLists1(head1, head2);
		printList(sum);

	}

	public static ListNode sumLists1(ListNode num1, ListNode num2) {

		ListNode res = null;
		ListNode curr = null;
		int carry = 0;

		num1 = reverse(num1);
		num2 = reverse(num2);

		// Iterate till either num1 is not empty or num2 is
		// not empty or carry is greater than 0
		while (num1 != null || num2 != null || carry != 0) {
			int sum = carry;

			// If num1 linked list is not empty, add it to sum
			if (num1 != null) {
				sum += num1.val;
				num1 = num1.next;
			}

			// If num2 linked list is not empty, add it to sum
			if (num2 != null) {
				sum += num2.val;
				num2 = num2.next;
			}

			// Create a new node with sum % 10 as its value
			ListNode newNode = new ListNode(sum % 10);

			// Store the carry for the next nodes
			carry = sum / 10;

			// If this is the first node, then make this node
			// as the head of the resultant linked list
			if (res == null) {
				res = newNode;
				curr = newNode;
			} else {
				// Append new node to resultant linked list
				// and move to the next node
				curr.next = newNode;
				curr = curr.next;
			}
		}

		// Reverse the resultant linked list to get the
		// required linked list
		return reverse(res);
	}

	public static ListNode reverse(ListNode head) {

		ListNode current = head;
		ListNode previous = null;
		ListNode ahead = null;

		while (current != null) {
			ahead = current.next;

			current.next = previous;

			previous = current;
			current = ahead;
		}
		return previous;
	}

	static void printList(ListNode head) {
		ListNode curr = head;
		while (curr != null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println();
	}

}
