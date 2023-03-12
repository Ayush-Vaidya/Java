class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        
        for(ListNode node: lists){
            if(node != null)
                minHeap.add(node);
        }
        
        ListNode dummy = new ListNode(0), cur = dummy;
        while(!minHeap.isEmpty()){
            ListNode minNode = minHeap.remove();
            cur.next = minNode;
            if(minNode.next != null)
                minHeap.add(minNode.next);
            cur = cur.next;
        }
        return dummy.next;
    }
}
