package leetcode.linkedlist;

public class ReverseSublistWithoutStack {

    public Node reverseList(Node head, int left, int right){
        int i = 1;
        Node currHead = head;
        Node dummy = new Node(0, head);
        Node lastNode = dummy;
        while(i < left){
            lastNode = currHead;
            currHead = currHead.next;
            i=i+1;
        }

        Node curr = currHead;
        if(curr == null){
            return head;
        }

        if (curr.next == null){
            return head;
        }

        Node prev = curr;
        curr = curr.next;
        i = i+1;
        while(curr != null && i <= right){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i=i+1;
        }
        lastNode.next = prev;
        currHead.next = curr;
        return dummy.next;
    }
}
