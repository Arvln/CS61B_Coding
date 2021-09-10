package Linked_List2_08;

public class DList {
    private DListNode head = null;
    private DListNode tail = null;
    private int size;

    public void addNode(Object item){
        DListNode newNode = new DListNode(item);

        if(head == null){
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }
}
