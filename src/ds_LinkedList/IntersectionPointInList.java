package ds_LinkedList;

public class IntersectionPointInList {

	public static void main(String[] args) {

		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(2);
		head1.next.next = new ListNode(9);

		ListNode head2 = new ListNode(5);
		head2.next = new ListNode(2);
		head2.next.next = new ListNode(6);

		ListNode node = listIntersectionPoint(head1, head2);
		System.out.println(node.val);

	}

//	static void printList(ListNode head) {
//		ListNode curr = head;
//		while (curr != null) {
//			System.out.print(curr.val + " ");
//			curr = curr.next;
//		}
//		System.out.println();
//	}

	public static ListNode listIntersectionPoint(ListNode head1, ListNode head2) {

		ListNode ptr1 = head1;
		ListNode ptr2 = head2;
		ListNode node = null;

		int length1 = findLengthOfList(head1);
		int length2 = findLengthOfList(head2);

		int diff = Math.abs(length1 - length2);

		if (length1 > length2) {
			while (diff > 0) {
				if (ptr1 == null)
					return null;
				ptr1 = ptr1.next;
				diff--;
			}
		} else {
			while (diff > 0) {
				if (ptr2 == null)
					return null;
				ptr2 = ptr2.next;
				diff--;
			}
		}

		while (ptr1 != null && ptr2 != null) {

			if (ptr1.next == ptr2.next) {
				node = ptr1.next;
				break;
			}

			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		return node;
		
	}
	

	public static int findLengthOfList(ListNode head1) {

		int length = 0;

		while (head1 != null) {

			length++;
			head1 = head1.next;

		}
		return length;

	}

}
