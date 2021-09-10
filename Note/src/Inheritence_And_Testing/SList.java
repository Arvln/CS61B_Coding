package Inheritence_And_Testing;

public class SList {
    // private can only be
    protected SListNode head;
    protected int size;

    public SList(){
        this.head = null;
        this.size = 0;
    }

    public void insertFirst(){
        head = new SListNode(head);
        size++;
    }
}
