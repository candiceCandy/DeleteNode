/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class DeleteNode {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    private int size(ListNode head) {
        if (head == null) {
            return 0;
        }
        int size = 0;
        ListNode curt = head;
        while (curt != null) {
            size ++;
            curt = curt.next;
        }
        return size;
    }
    ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
       
        ListNode curt = head; // fast
        int size = size(head);
        int index = size - n;
        
        if (index == 0) {
            ListNode temp = curt.next;
            dummy.next = temp;
            return dummy.next;
        }
        
        for (int i = 0; i < index - 1; i++) {
            curt = curt.next;
        }
        
        ListNode temp = curt.next.next;
        curt.next = temp;
        return dummy.next;
        
    }
}