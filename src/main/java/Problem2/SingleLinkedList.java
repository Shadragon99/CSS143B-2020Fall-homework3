package Problem2;

import java.util.List;

// all functions assume using dummy node
public class SingleLinkedList {
    // do not add member variables
    private ListNode head;
    private int size;

    public SingleLinkedList() {

        head = new ListNode();  // dummy node
    }

    // copy constructor
    public SingleLinkedList(SingleLinkedList list) {

        if(list == null){
            return;
        }
        ListNode p1 = new ListNode();
        head = p1;
        ListNode p2 = list.head.next;
        p1 = head;
        while(p2 != null){
            p1.next = new ListNode(p2.val);
            p1 = p1.next;
            p2 = p2.next;
        }
        size = list.size;
    }

    public int removeAll(int valueToRemove) {

        int val = 0;
        ListNode p1 = new ListNode(); //Store head node
        ListNode p2 = null;
        p1 = head;
        while(p1 != null && p1.val == valueToRemove){ // Check if head node and are there multiple occurrences of
                                                        // valueToRemove
            head = p1.next;
            p1 = head;
            val ++;
        }
        while(p1 != null){ //Delete the valueToRemove
            while(p1 != null && p1.val != valueToRemove){
                p2 = p1;
                p1 = p1.next;
            }
            if (p1 == null){
                return 0;
            }
            p2.next = p1.next;
            p1 = p2.next;
        }
        return val; //Return how many values there were that were removed
    }

    // reverse the linked list nodes iteratively (no recursion)
    public void reverse() {

        ListNode p = null;
        ListNode c = head;
        while(c != null){
            ListNode next = c.next;
            c.next = p;
            p = c;
            c = next;
        }
        this.head = p;
    }

    // do not change any function below

    public SingleLinkedList(int[] data) {
        this();
        if (data == null) {
            return;
        }
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
            size++;
        }
    }

    // Appends the specified element to the end of this list
    public void add(int val) {
        size++;
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new ListNode(val);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end " : " -> ");
            ptr = ptr.next;
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }
}
