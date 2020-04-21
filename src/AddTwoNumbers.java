
	
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    }
	 
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead;
        int carry = 0;
        int remainder = 0;
        int sum = 0;
        while (l1 != null || l2 != null || carry != 0) {
            if ((l1 == null || l2 == null) && carry == 0) {
                temp.next = (l1 == null) ? l2 : l1;
                break;
            }
            sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            carry = sum / 10;
            remainder = sum % 10;
            temp.next = new ListNode(remainder);
            temp = temp.next;
            l1 = (l1 != null ? l1.next : null);
            l2 = (l2 != null ? l2.next : null);
        }
        return dummyHead.next;
    }
}


