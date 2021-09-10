package Inheritence_And_Testing;

public class TailList extends SList {
    private SListNode tail;

    public void insertFirst(Object obj){
        super.insertFirst();
        if(size == 1){
            tail = head;
        }
    }

    public void insertEnd(Object obj){
        if(tail == null){
            head = tail = new SListNode(obj);
        } else {
            tail = tail.next = new SListNode(obj);
        }
        size++;
    }
}
