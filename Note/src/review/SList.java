package review;

public class SList {
    public SListNode head;
    public int size;

    public SList(){
        head = null;
        size = 0;
    }

    public void insertItem(Object item){
        head = new SListNode(item, head);
        size++;
    }
}
