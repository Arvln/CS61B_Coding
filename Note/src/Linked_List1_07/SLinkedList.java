package Linked_List1_07;

public class SLinkedList {
    public SListNode head;
    public int listSize;

    public SLinkedList(){  // represent empty linked list
        head = null;
        listSize = 0;
    }

    public void insertFront(Object item){
        head = new SListNode(item, head);
        listSize++;
    }
}
