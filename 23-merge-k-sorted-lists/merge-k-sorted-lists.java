/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeapPQ = new PriorityQueue<>();
        for(ListNode head : lists){
            ListNode temp = head;

            while(temp != null){
                minHeapPQ.add(temp.val);
                temp = temp.next;
            }
        }

        ListNode newList = new ListNode(0);
        ListNode head = newList;

        while(minHeapPQ.size() > 0){
            int num = minHeapPQ.poll();
            head.next = new ListNode(num);
            head = head.next;
        }
        return newList.next;
    }
}