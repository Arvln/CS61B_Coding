package review;

public class DList {
    public DListNode head;
    public DListNode tail;
    public int size;

    public DList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void insertItem(Object item){
        DListNode newNode = new DListNode(item);
        if(head == null){
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
}
