package ds_LinkedList;

public class CopyOfLinkedList {

	public static void main(String[] args) {

		ListNode head = mergeTwoLists(new ListNode(5), new ListNode(3));

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode ptr1 = l1;
		ListNode ptr2 = l2;
		ListNode head;
		ListNode currNode;

		if (ptr1.val < ptr2.val) {
			head = ptr1;
			currNode = head;
			ptr1 = ptr1.next;
		} else {
			head = ptr2;
			currNode = head;
			ptr2 = ptr2.next;
		}

		while (ptr1 != null && ptr2 != null) {

			if (ptr1.val <= ptr2.val) {
				currNode.next = ptr1;
				currNode = currNode.next;
				ptr1 = ptr1.next;
			} else {
				currNode.next = ptr2;
				currNode = currNode.next;
				ptr2 = ptr2.next;
			}

		}

		if (ptr1 == null) {
			while (ptr2 != null) {
				currNode.next = ptr2;
				currNode = currNode.next;
				ptr2 = ptr2.next;
			}
		} else {
			while (ptr1 != null) {
				currNode.next = ptr1;
				currNode = currNode.next;
				ptr1 = ptr1.next;
			}
		}

		return head;

	}
}